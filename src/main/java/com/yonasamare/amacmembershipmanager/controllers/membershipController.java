package com.yonasamare.amacmembershipmanager.controllers;

import com.yonasamare.amacmembershipmanager.records.Application;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(path ="membership", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class membershipController {

    @GetMapping("home")
    public String welcomeMembers(){
        return "Welcome to AMAC";
    }

    @PostMapping(path = "new-member")
    public String registerNewMember(@RequestBody Application app){
        return "Application Received from "+ app.getName();
    }
}
