package com.launchcode.controller;

import com.launchcode.model.HelloMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    // localhost:8080/hello


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        return "<h1>Hello, world!</h1>";
    }

    @RequestMapping(value = "/helloWithName", method = RequestMethod.GET)
    @ResponseBody
    public String helloWithName() {
        return String.format("<h1>%s</h1>", HelloMessage.getMessage("Bartosz"));
    }

}