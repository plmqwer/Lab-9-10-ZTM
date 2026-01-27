package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class SampleController {

    @GetMapping("/test")
    public String testEndpoint() {
        return "To jest testowy endpoint aplikacji: Beniamin PRALAT, Damian SIUDOWSKI, Lukasz SZAJNA";
    }

    @GetMapping("/users")
    public List<Map<String, Object>> getUsers() {
        return List.of(
            Map.of("id", 1, "name", "Beniamin", "surname", "PRALAT", "email", "beniamin@gmail.com"),
            Map.of("id", 2, "name", "Damian", "surname", "SIUDOWSKI", "email", "damian@gmail.com"),
            Map.of("id", 3, "name", "Lukasz", "surname", "SZAJNA", "email", "lukasz@gmail.com")
        );
    }
}
