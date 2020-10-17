package com.launchcode.controller;

import com.launchcode.model.HelloMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    // localhost:8080/hello
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        return "<h1>Hello, world!</h1>";
    }

    // localhost:8080/helloWithName?name=Bartosz
    @RequestMapping(value = "/helloWithName", method = RequestMethod.GET)
    @ResponseBody
    public String helloWithName(HttpServletRequest httpServletRequest) {
        // get name parameter from request
        String name = httpServletRequest.getParameter("name");


        return String.format("<h1>%s</h1>", HelloMessage.getMessage(name));
    }

}