package org.launchcode.Planner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PlannerEditController {

    //Handle request at/hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }
    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    //create handles request of the form /hello?name

    @GetMapping("hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name){
        return "hello, " + "!";
    }
}
