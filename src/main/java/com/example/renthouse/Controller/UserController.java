package com.example.renthouse.Controller;

import com.example.renthouse.Entity.User;
import com.example.renthouse.Request.UserRequest;
import com.example.renthouse.Service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    @PostMapping
    public ResponseEntity<User> saveUser(@Valid @RequestBody UserRequest userRequest){

        User userSaved = userService.addUser(userRequest);
        return new ResponseEntity<>(userSaved, HttpStatus.CREATED);
    }
}
