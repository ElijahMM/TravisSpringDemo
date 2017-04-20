package com.example;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

/**
 * Created by mihai on 20.04.2017.
 */
@RestController
public class UserController {


    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResponseEntity getString() {
        return ResponseEntity.status(HttpStatus.OK).body("this is a string");
    }

}
