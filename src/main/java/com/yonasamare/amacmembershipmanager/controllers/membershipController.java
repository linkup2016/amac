package com.yonasamare.amacmembershipmanager.controllers;

import com.yonasamare.amacmembershipmanager.jpa.Member;
import com.yonasamare.amacmembershipmanager.records.Confirmation;
import com.yonasamare.amacmembershipmanager.services.MemberServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(path ="membership", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class membershipController {

    @Autowired
    private MemberServices memberServices;
    @GetMapping("home")
    public String welcomeMembers(){
        return "Welcome to AMAC";
    }

    @PostMapping(path = "new-member")
    public ResponseEntity<Confirmation> registerNewMember(@RequestBody Member member){
        return ResponseEntity.ok().body(memberServices.saveMember(member));
    }
}
