package com.example.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class viewController {
    @GetMapping("/view/colors")
    public String colorsPage() {
        return "colors";  // looks for templates/colors.html
    }
}
