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
          new User(1,"Beniamin","PRALAT","beniamin@gmail.com"),
          new User(2,"Damian","SIUDOWSKI","damian@gmail.com"),
          new User(3,"Lukasz","SZAJNA","lukasz@gmail.com"),
        );
    }
}

