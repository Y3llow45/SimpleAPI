package com.example.example.controller;

import com.example.example.model.Color;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ColorController {

    @GetMapping("/colors")
    public List<Color> all() {
        return List.of(
                new Color("Red", "#FF0000"),
                new Color("Green", "#00FF00"),
                new Color("Blue", "#0000FF")
        );
    }
}
