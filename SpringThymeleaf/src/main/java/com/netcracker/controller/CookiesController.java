//package com.netcracker.controller;
//
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.CookieValue;
//import org.springframework.web.bind.annotation.GetMapping;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletRequest;
//import java.util.Arrays;
//import java.util.stream.Collectors;
//
//    @RestController
//    public class CookiesController {
//
//        @GetMapping("/read-cookie")
//        public String readCookie(@CookieValue(value = "content", defaultValue = "default") String username) {
//            return "Hey! My username is " + username;
//        }
//
//        @GetMapping("/all-cookies")
//        public String readAllCookies(HttpServletRequest request) {
//            Cookie[] cookies = request.getCookies();
//            if (cookies != null) {
//                return Arrays.stream(cookies)
//                        .map(cookie -> cookie.getName() + "=" + cookie.getValue()).collect(Collectors.joining(", "));
//            }
//            return "No cookies";
//        }
//
//    }
//
