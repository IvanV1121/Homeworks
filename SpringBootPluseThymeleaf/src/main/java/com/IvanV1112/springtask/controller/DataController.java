package com.IvanV1112.springtask.controller;

import com.IvanV1112.springtask.model.User;
import com.IvanV1112.springtask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class DataController {

    private UserService userService;

    @Autowired
    public DataController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/data")
    public String dataForm(Model model) {
        model.addAttribute("user", new User());
        return "data";
    }

    @PostMapping("/data")
    public String dataSubmit(Model model, @ModelAttribute User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "data";
        }
        userService.addUser(user);
        return "redirect:/data";
    }

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        userService.fileUpload(file);
        return "redirect:/data";
    }

}
