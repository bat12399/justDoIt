package com.yj.justDoIt.controller;

import com.yj.justDoIt.pojo.User;
import com.yj.justDoIt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping("/getlist")
    public List<User> getLists(){
        List<User> userList = userService.list();
        return userList;
    }
}
