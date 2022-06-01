package com.IvanV1112.springtask.controller;

import com.IvanV1112.springtask.model.Message;
import com.IvanV1112.springtask.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmailController {

    private EmailService emailService;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @GetMapping("/send")
    public String sendForm(Model model, @RequestParam(value = "toEmail") String to) {
        model.addAttribute("message", new Message(to));
        return "send";
    }

    @PostMapping("/send")
    public String sendSubmit(@ModelAttribute Message message) {
        emailService.sendMessage(message.getTo(), message.getSubject(), message.getText());
        return "send";
    }

}
