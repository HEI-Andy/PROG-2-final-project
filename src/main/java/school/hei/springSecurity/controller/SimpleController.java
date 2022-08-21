package school.hei.springSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping("/test/Roles/Admin")
    public String testRoleAdmin(){
        return "Welcome to the admin";
    }

    @GetMapping("/test/Roles/User")
    public String testRoleUser(){
        return "Welcome to the user";
    }
}
