package ru.rest.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;

public class CheckEmailValidate implements ConstraintValidator <CheckEmail,String>{
private List<String> emailDomens;
    @Override
    public void initialize(CheckEmail constraintAnnotation) {

        emailDomens =new ArrayList<>();
        emailDomens.add("ya.ru");
        emailDomens.add("mail.ru");
        emailDomens.add("rambler.ru");
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
//        if((email.endsWith("ya.ru"))||(email.endsWith("mail.ru"))||(email.endsWith("rambler.ru"))){
//            return true;
//        }
//        return false;
//    }
        for(String emailDomen : emailDomens){
        if(email.endsWith(emailDomen)) return true;
        }
        return false;
    }
}
