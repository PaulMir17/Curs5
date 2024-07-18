package com.example.demo.controllers;

import com.example.demo.services.ColorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private ColorService colorService;

    public IndexController (ColorService colorService) {
        this.colorService = colorService;
    }

    @GetMapping("/color-background")
    public String indexAction(Model model){

        model.addAttribute("red",colorService.getRed());
        model.addAttribute("blue",colorService.getBlue());
        model.addAttribute("green",colorService.getGreen());

        return "index.html";

    }
}
