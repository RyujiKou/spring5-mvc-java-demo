package dev.cooeeu.demo.spring5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "SpringMVCデモサイト");
        return "index";
    }
}