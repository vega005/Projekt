package com.example.Projekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @Autowired
    GameRepo gameRepo;

    @GetMapping("/hello")
    public String get() {
        return "hello";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/search")
    public String contact(Model model) {

        Iterable<GameItem> games = gameRepo.findAll();
        model.addAttribute("games", games);

        return "search";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
