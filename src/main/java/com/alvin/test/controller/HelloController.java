package com.alvin.test.controller;

import com.alvin.test.entity.SimpleResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() throws Exception {
        final SimpleResponse simpleResponse = new SimpleResponse();
        simpleResponse.setResponse("Hello Test!");
        final ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(simpleResponse);
    }
}
