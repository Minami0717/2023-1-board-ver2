package com.green.boardver2.ngj.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("ngjUserController")
@RequestMapping("/ngj/user")
public class UserController {
    @PostMapping
    public int postUser() {
        return 0;
    }
}
