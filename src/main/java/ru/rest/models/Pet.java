package ru.rest.models;

import lombok.Data;
import ru.rest.validation.CheckEmail;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Data
@Table(name = "animal")



public class Pet {
    @Id
    @Column(name = "id",unique = true,updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "pets")
    @NotBlank(message = "Animal data entered incorrectly")
    @Size(min = 2 , max= 30 , message =
            "The name of the animal must be at least 2 characters")
    private String pets;

    @Column(name = "petName")
    @NotBlank(message =
            "The name of the Animal was entered incorrectly")
    @Size(min = 2 , max= 30 , message =
            "The name of the animal must be at least 2 characters")
    private String petName;

    @Column(name = "age")
    @Min(value = 3,message =
            "the animal must not be younger than 3 years old")
    private int age;

    @Column(name = "sex_of_the_animal")
    @NotBlank(message = "Specify the gender of the animal")
    private String sexOfTheAnimal;

    @Column(name = "city")
    private String city;

    @Column(name = "email")
    @NotBlank(message = "The mail data was entered incorrectly")
    @Email(message = "Isn't email")
    @CheckEmail
    private String emailOfTheOwner;

    @Column(name = "phone_number")
    @Pattern(regexp = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{10}$",message = "Pleas use pattern +7-XXX-XXX-XX-XX" )
    private String phoneNumberOfTheOwner;

}
