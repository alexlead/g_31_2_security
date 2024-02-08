package de.aittr.g_31_2_security.controllers;

import de.aittr.g_31_2_security.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserService {

    private UserService service;

    public UserService(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public User register (@RequestBody User user) {
        return service.register(user);
    }
}
