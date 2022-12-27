package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserControllerTest {

    @Autowired private UserController userController;

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
