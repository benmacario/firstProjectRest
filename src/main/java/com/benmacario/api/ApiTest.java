package com.benmacario.api;

import com.benmacario.api.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("v1/api/")
public class ApiTest {
    @GetMapping("users")
    public User getDataUser() {
        User user = new User("Gustavo Lima","000.000.000-00");
        return user;
    }

    @PostMapping("users")
    public ResponseEntity store(@RequestBody User user) {
        return new ResponseEntity(user, HttpStatus.CREATED);
    }
}
