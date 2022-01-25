package danial.demo.user.controller;

import danial.demo.user.entity.User;
import danial.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RolesAllowed("")
    @RequestMapping(value = "/register", method = RequestMethod.POST, name = "create a user together with role")
    public void createUser(@RequestBody @Validated User user) {
        userService.createUser(user);
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET, name = "log in a user to application")
    public boolean login(@RequestBody User user) {
        return userService.login(user);
    }

}
