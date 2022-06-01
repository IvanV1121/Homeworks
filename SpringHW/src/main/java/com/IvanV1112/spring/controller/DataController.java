package com.IvanV1112.spring.controller;

import com.IvanV1112.spring.model.User;
import com.IvanV1112.spring.service.FileService;
import com.IvanV1112.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class DataController {

    private UserService userService;
    private FileService fileService;

    @Autowired
    public DataController(UserService userService, FileService fileService) {
        this.userService = userService;
        this.fileService = fileService;
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
        fileService.fileUpload(file);
        return "redirect:/data";
    }

}
