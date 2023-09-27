package com.example.cafepizza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

    @GetMapping("/logout")
//    public String logout(HttpServletRequest request, HttpServletResponse response) {
    public String logout() {

        return "redirect:/login?logout=true";
//        return "redirect:/login?logout=true";
    }
}
