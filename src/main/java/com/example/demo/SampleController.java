package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SampleController {

    @GetMapping("/test")
    public String testEndpoint() {
    return "To jest testowy endpoint";
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return List.of(
          new User(1,"jan","nowak","email1@gmail.com"),
          new User(2,"jan","kowalski","email2@gmail.com"),
          new User(3,"jan","wisniewski","email3@gmail.com"),
          new User(4,"jan","stefan","email4@gmail.com")
        );
    }
}
