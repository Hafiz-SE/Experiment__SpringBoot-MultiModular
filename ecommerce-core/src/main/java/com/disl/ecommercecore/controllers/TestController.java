package com.disl.ecommercecore.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.disl.auth.payloads.*;

@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping()
    public Response testResponse() {
        return new Response(HttpStatus.OK, true, "Success", null);
    }

    }
