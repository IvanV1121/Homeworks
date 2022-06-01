package com.IvanV1112.springtask.controller;

import com.IvanV1112.springtask.model.User;
import com.IvanV1112.springtask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
public class FindController {
    private UserService userService;

    @Autowired
    public FindController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/find")
    public String findForm(Model model) {
        model.addAttribute("user", new User());
        return "find";
    }

    @PostMapping("/find")
    public String findSubmit(Model model, @ModelAttribute User user, @RequestHeader(value = "User-Agent") String userAgent) {
        List<User> foundedUsers = userService.findUser(user);
        if (foundedUsers.isEmpty()) {
            return "not-found";
        }
        model.addAttribute("foundedUsers", foundedUsers);
        model.addAttribute("time", new Date());
        model.addAttribute("userAgent", userAgent);
        return "find-result";
    }
}
