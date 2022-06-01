package com.IvanV1112.springtask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class StartPageController {

    @GetMapping("/")
    public String indexForm() {
        return "index";
    }
}
