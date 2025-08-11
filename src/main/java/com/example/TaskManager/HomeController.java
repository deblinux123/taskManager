package com.example.TaskManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController 
{
    @GetMapping("/")
    public String showHoemPage()
    {
        return "home";
    }    
}
