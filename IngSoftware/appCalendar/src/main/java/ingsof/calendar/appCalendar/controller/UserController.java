package ingsof.calendar.appCalendar.controller;

import ingsof.calendar.appCalendar.modeller.UserModeller;
import ingsof.calendar.appCalendar.repository.UserRepository;
import ingsof.calendar.appCalendar.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<UserModeller> getHalls() {
        return userService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public UserModeller save(@RequestBody UserModeller user) {
        return userService.save(user);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int userId) {
        return userService.deleteUser(userId);
    }
}

