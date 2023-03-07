package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    // text
    @GetMapping("/text")
    public String next(@RequestParam String account) {
        return account;
    }

    // JSON
    // request -> object mapper -> object -> method -> object mapper -> json -> respone
    @PostMapping("/json")
    public User json(@RequestBody User user){
        return user; // 200 OK
    }

    // ResponeEntity
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

}


