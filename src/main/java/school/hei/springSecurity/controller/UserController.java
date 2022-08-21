package school.hei.springSecurity.controller;

import school.hei.springSecurity.model.User;
import school.hei.springSecurity.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;
    @GetMapping("/")
    public String Hello (){
        return "Welcome!";
    }

    @PostMapping("/User")
    public User creatUser (@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/User/all")
    public List<User> getUser(){
        return userService.getUser();
    }
}
