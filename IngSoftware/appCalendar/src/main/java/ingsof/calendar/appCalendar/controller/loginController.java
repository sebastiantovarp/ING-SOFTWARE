package ingsof.calendar.appCalendar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }

}
