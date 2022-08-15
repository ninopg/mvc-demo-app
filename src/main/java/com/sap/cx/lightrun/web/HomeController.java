package com.sap.cx.lightrun.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping(value = "/{user}", method = RequestMethod.GET)
    public String hello(@PathVariable(required = false) String user) {
        final String loggedUser = (user != null && !user.isBlank()) ? user : "anonymous";
        return "Hello " + loggedUser + "!";
    }

}
