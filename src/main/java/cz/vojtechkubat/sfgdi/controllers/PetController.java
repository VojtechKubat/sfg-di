package cz.vojtechkubat.sfgdi.controllers;

import cz.vojtechkubat.pets.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String saySomething() {
        return this.petService.saySomething();
    }
}
