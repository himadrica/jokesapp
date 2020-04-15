package com.pandit.jokes.jokeapp.controllers;

import com.pandit.jokes.jokeapp.services.JokeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeServices jokeServices;

    @Autowired
    public JokeController(JokeServices jokeServices) {
        this.jokeServices = jokeServices;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeServices.getJoke());
        return "chucknorris";
    }
}
