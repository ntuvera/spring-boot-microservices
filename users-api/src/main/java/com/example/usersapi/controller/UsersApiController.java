package com.example.usersapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UsersApiController {

   @GetMapping("/")
   public String home() {
       return "/users controller";
   }

    @GetMapping("/list")
    public String listUsers() {
        return "/list get";
    }

    @PostMapping("/")
    public String createUser() {
        return "/users post";
    }

    @PutMapping("/")
    public String updateUser() {
        return "/users put";
    }

    @DeleteMapping("/")
    public String deleteUser() {
        return "/users delete";
    }

}
