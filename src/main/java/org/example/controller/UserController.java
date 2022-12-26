package org.example.controller;

import org.example.model.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
        public List<User> getUsers() {
        return Arrays.asList(
                new User(1, "John"),
                new User(2, "Jane"),
                new User(3, "Jack")
        );
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        user.setId(id);
        return userService.updateUser(user);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
         userService.deleteUser(id);
    }
//    @GetMapping("/users")
//    public List<User> getUsers() {
//        return Arrays.asList(
//                new User(1, "John"),
//                new User(2, "Jane"),
//                new User(3, "Jack")
//        );
//    }
//
//    @GetMapping("/")
//    public ResponseEntity<String> getResponseCode() {
//        return new ResponseEntity<>("Check response code 200", HttpStatus.OK);
//    }
//
//    @PostMapping("/user")
//    public void createUser() {
//        new User(4,"Mo");
//    }



}



