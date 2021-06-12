package com.test.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    
    @GetMapping("/")
    @ResponseBody
    public String home(){
        return ("<h1>Welcome to Home</h1>");
    }
    @GetMapping("/user")
    @ResponseBody
    public String user(){
        return ("<h1>Welcome User</h1>");
    }
    @GetMapping("/admin")
    @ResponseBody
    public String admin(){
        return ("<h1>Welcome Admin</h1>");
    }
    
}
