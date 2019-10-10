package com.zhm.hwj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping(name = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello SpringBoot";
    }
}
