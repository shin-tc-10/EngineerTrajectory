package com.example.EngineerTrajectory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TopController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String top(Model model) {
        model.addAttribute("message", "Hello Springboot");

        return "index";
    }
}
