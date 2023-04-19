package com.usa.IngSoftware.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calendario")
public class ControladorPagina {

    @GetMapping()
    public String pagina() {
        return "Calendario";
    }
}
