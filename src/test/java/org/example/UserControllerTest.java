package org.example;

import org.example.controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserControllerTest {

    @Autowired
    private UserController userController;

//    @Test
//    void testUserListIsNotEmpty() {
////        List<User> users = userController.getUsers();
////        assertThat(users).isNotEmpty();
//    }
//
//    @Test
//    void testStatus200() {
////        ResponseEntity<String> response = userController.getResponseCode();
////        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
//    }
}
