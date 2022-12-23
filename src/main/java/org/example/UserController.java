package org.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/users")
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers() {
        return Arrays.asList(
                new User(1, "John"),
                new User(2, "Jane"),
                new User(3, "Jack")
        );
    }

    @GetMapping("/")
    public ResponseEntity<String> getResponseCode() {
        return new ResponseEntity<>("Check response code 200", HttpStatus.OK);
    }

    @PostMapping("/user")
    public void createUser() {
        new User(4,"Mo");
    }
}



class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
