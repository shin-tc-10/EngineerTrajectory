package com.example.EngineerTrajectory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyPageController {

    @RequestMapping(value = "/myPage", method = RequestMethod.GET)
    public String showMyPage() {
        return "myPage";
    }

}
