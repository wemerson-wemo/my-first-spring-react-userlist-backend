package com.example.userapi;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:5173") // React-Dev-Server erlauben
public class UserController {

    private final UserRepository repo;
    public UserController(UserRepository repo) {this.repo = repo;}

    @GetMapping
    public List<UserEntity> all() {
        return repo.findAll();
    }
}