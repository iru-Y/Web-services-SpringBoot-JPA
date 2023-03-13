package com.crud.project.yuri.projectcrud.resources;
import com.crud.project.yuri.projectcrud.entites.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Yuri", "yuri_matteus@hotmail.com", "99988064325", "12345");
        return ResponseEntity.ok().body(u);
    }
}
