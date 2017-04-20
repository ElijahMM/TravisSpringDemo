package com.example;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mihai on 20.04.2017.
 */
@RestController
public class UserController {


    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getString(){
        return "this is a string";
    }

}
