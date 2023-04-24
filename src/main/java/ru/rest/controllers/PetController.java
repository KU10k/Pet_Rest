package ru.rest.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.rest.models.Pet;
import ru.rest.service.PetService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class PetController {

    private final PetService petService;

    @GetMapping("/")
    public List<Pet> getAllPet(){
        return petService.getAll();
    }

//    @GetMapping("/{id}")
//    public String petInfo(@PathVariable("id") int id,Model model){
//        model.addAttribute("pet",petService.getById(id));
//        return "pet-info";
//    }
//    @GetMapping("/create")
//    public String petCreate(Model model){
//        model.addAttribute("create",true);
//        model.addAttribute("pet",new Pet());
//        return "pet-save-or-update";
//    }
//    @GetMapping("/update/{id}")
//    public String petUpdate(@PathVariable("id") int id,Model model){
//        model.addAttribute("create",false);
//        model.addAttribute("pet",petService.getById(id));
//        return "pet-save-or-update";
//    }
//    @PostMapping("/create-update")
//    public String petCreate(@Valid @ModelAttribute("pet") Pet pet, BindingResult result){
//        if(result.hasErrors()) return "pet-save-or-update";
//        petService.saveOrUpdate(pet);
//        return "redirect:/";
//    }
//
//
//    @PostMapping("/delete/{id}")
//    public String petDelete(@PathVariable("id") int id){
//        petService.delete(id);
//        return "redirect:/";
//    }

}
