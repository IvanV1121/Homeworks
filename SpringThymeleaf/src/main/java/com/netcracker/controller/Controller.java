package com.netcracker.controller;

import com.netcracker.serv.EmailService;
import com.netcracker.serv.UserService;

public class Controller {

    private UserService userService;
    private EmailService emailServlet;

    public Controller(UserService userService, EmailService emailServlet) {
        this.userService = userService;
        this.emailServlet = emailServlet;
    }
}
