package com.example.exception.controller;

import com.example.exception.dto.User;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Validated
public class Apicontroller {

    @GetMapping("")
    public User get(
            @Size(min =2)
            @RequestParam String name,

            @NotNull
            @Min(1)
            @RequestParam Integer age){
        User user = new User();
        user.setName(name);
        user.setAge(age);


        return user;
    }

    @PostMapping("")
    public User post(@Valid @RequestBody User user){
        System.out.println(user);
        return user;
    }

//    // 특정한 컨트롤러에 지정하고 싶으면 컨트롤러 안에 작성 전체시스템에 적용하고 싶으면 어드바이스에
//    @ExceptionHandler(value = MethodArgumentNotValidException.class)
//    public ResponseEntity methodArgumentNotValidException(MethodArgumentNotValidException e){
//        System.out.println("api controller");
//
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
//    }
}
