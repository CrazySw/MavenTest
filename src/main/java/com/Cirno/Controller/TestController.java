package com.Cirno.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping(value = "hello")
    @ResponseBody
    public String Test(){
        return "shiroTest";
    }

    @RequestMapping(value = "static")
    public String Static(){
        return "static";
    }
}
