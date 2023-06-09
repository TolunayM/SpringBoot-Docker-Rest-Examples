package com.mongolu.controller;

import com.mongolu.entity.User;
import com.mongolu.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostConstruct
    public void init(){
        User user_tolunay = new User();
        user_tolunay.setName("Tolunay");
        user_tolunay.setSurname("Mutlu");
        userRepository.save(user_tolunay);
    }

    @Autowired
    private UserRepository userRepository;
    @PostMapping
    public ResponseEntity<User> add(@RequestBody User user){
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> listAll(){
        return ResponseEntity.ok(userRepository.findAll());
    }
}
