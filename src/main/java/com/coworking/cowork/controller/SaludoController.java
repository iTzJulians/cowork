package com.coworking.cowork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/saludo")
    public String Saludar(){
        return "Hola, bienevenido a mi proyecto de cowork";
    }
}
