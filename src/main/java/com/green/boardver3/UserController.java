package com.green.boardver3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService SERVICE;

    @Autowired
    public UserController(UserService service){
        this.SERVICE = service;
    }

    @PostMapping
    public int postUser (@RequestBody UserInsEntity entity) {
        return SERVICE.postUser(entity);
    }
}

