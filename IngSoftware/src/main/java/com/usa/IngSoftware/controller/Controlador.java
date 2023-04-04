package com.usa.IngSoftware.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registro")
public class Controlador {

    @GetMapping
    public String saludo(){
        return"<h1>OLA MADRE KE ASE</h1>";
    }





}
