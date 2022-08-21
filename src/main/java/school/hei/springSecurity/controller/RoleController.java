package school.hei.springSecurity.controller;

import school.hei.springSecurity.model.Role;
import school.hei.springSecurity.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class RoleController {
    private RoleService roleService;

    @PostMapping("/Roles")
    public Role createRole (@RequestBody Role role){
        return roleService.save(role);
    }

    @GetMapping("/Roles")
    public List<Role> getAll(){
        return roleService.getAll();
    }
}
