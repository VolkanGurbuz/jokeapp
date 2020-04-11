package com.volkangurbuz.joke.jokeapp.controllers;


import com.volkangurbuz.joke.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {


    private JokeService jokeService;


    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        //joke property
        model.addAttribute("joke", jokeService.getJoke());
        //viewname chucknorris and html name
        return "chucknorris";
    }

}
