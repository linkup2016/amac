package com.yonasamare.amacmembershipmanager.controllers;

import com.yonasamare.amacmembershipmanager.jpa.Member;
import com.yonasamare.amacmembershipmanager.records.Confirmation;
import com.yonasamare.amacmembershipmanager.services.MemberServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController()
@RequestMapping(path = "membership", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class membershipController {

    @Autowired
    private MemberServices memberServices;

    @GetMapping("home")
    public String welcomeMembers() {
        return "Welcome to AMAC";
    }

    @GetMapping("id")
    public ResponseEntity<Member> getMember(@PathVariable String id){
        return ResponseEntity.ok(new Member());
    }

    /*
    * On success, the API will return a Response with Status Code: 201 CREATED, containing the URI (location) of the new Cash Card resource in the Response headers.
    * To see if the URI has been created on postman, toggle to Headers from the response section as shown in the screenshot (uri-in-headers.png) located main/resources/static folder.
    * */
    @PostMapping(path = "new-member")
    public ResponseEntity<Confirmation> registerNewMember(@RequestBody Member member) throws URISyntaxException {
        return ResponseEntity.status(HttpStatus.CREATED)
                .header(HttpHeaders.LOCATION, new URI("http://localhost:8080/membership/id").toASCIIString()).body(memberServices.saveMember(member));
    }
}
