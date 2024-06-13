package com.api.prechell.legacy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MainController {

    @GetMapping("/")
    public String mainP() {
        System.out.println("여기를 지나갔어요");
        return "Main Controller";
    }
}
