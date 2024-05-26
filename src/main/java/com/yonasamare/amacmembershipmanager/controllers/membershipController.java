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
import java.util.Optional;

@RestController()
@RequestMapping("/membership")
public class membershipController {

    @Autowired
    private MemberServices memberServices;

    @GetMapping( "/home")
    public String welcomeMembers() {
        return "Welcome to AMAC";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Member> getMember(@PathVariable String id) {
        Optional<Member> member = memberServices.getMemberById(id);
        return member.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    /*
     * On success, the API will return a Response with Status Code: 201 CREATED, containing the URI (location) of the new Cash Card resource in the Response headers.
     * To see if the URI has been created on postman, toggle to Headers from the response section as shown in the screenshot (uri-in-headers.png) located main/resources/static folder.
     * */


    /*
    * No need to add "path=" in the @GetMapping because there are no other properties being set. This is not true for the post mapping below because
    * we're setting other properties like MediaType.
    *
    * Not sure why but the path can be written without a preceding "/" forward slash. The "/new-member" can be just "new-member" still works.
    * */
    @PostMapping(path = "/new-member", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Confirmation> registerNewMember(@RequestBody Member member) throws URISyntaxException {
//        Note that it returned a 201 status instead of 200. This is most appropriate status code since a new resource is created.
        return ResponseEntity.status(HttpStatus.CREATED)
                .header(HttpHeaders.LOCATION, new URI("http://localhost:9002/membership/id").toASCIIString()).body(memberServices.saveMember(member));
    }

    @PostMapping(path = "/batch", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Confirmation> registerNewMembers(@RequestBody Member member) throws URISyntaxException {
        return ResponseEntity.status(HttpStatus.CREATED)
                .header(HttpHeaders.LOCATION, new URI("http://localhost:9002/membership/id").toASCIIString()).body(memberServices.saveMember(member));
    }
}
