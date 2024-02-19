package com.yj.justDoIt.controller;

import com.yj.justDoIt.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class HelloController {

    LoginService loginService;

    @RequestMapping("/hello")
    public String hello() {
        return "index";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {

        // 在这里进行登录验证逻辑
        if (loginService.doLogin(username, password)) {
            model.addAttribute("username", username);
            return "/home/success";
        } else {
            model.addAttribute("error", "用户名或密码错误");
            return "login";
        }
    }
}
