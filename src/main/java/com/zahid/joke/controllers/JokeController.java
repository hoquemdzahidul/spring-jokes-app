package com.zahid.joke.controllers;

import com.zahid.joke.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

/**
 * Created by Zahid on 11/29/2017.
 */
@Controller
public class JokeController {
    private JokeService jokeService;
   @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/" , ""})
    public String showJoke(Model model)
    {
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}
