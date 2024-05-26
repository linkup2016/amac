package com.yonasamare.amacmembershipmanager.controllers;

import com.jayway.jsonpath.DocumentContext;
import com.yonasamare.amacmembershipmanager.jpa.Member;
import com.yonasamare.amacmembershipmanager.records.Confirmation;
import net.minidev.json.JSONArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import com.jayway.jsonpath.JsonPath;
import static org.assertj.core.api.Assertions.assertThat;

/*
* The @DirtiesContext clears the application context after each method or class runs.
* */
@ActiveProfiles({"local"})
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class MembershipControllerTest {

    /*@Autowired
    TestRestTemplate restTemplate;

    private Member member;
    @BeforeEach
    void setUp(){
        member = new Member();
        member.setEmail("you@gmail.com");
        member.setOrderId("2093ujr");
    }
    @Test
    void welcomeMembers() {
        ResponseEntity<String> response = restTemplate.getForEntity("/membership/home", String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).contains("Welcome to AMAC");
    }

    @Test
    void getMember() {
    }

    @Test
    void registerNewMember() {
        ResponseEntity<Confirmation> response = restTemplate.postForEntity("/new-member", member, Confirmation.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

        DocumentContext documentContext = JsonPath.parse(response.getBody());
        int cashCardCount = documentContext.read("$.id");
        assertThat(cashCardCount).isEqualTo(3);

        JSONArray ids = documentContext.read("$..id");
        assertThat(ids).containsExactlyInAnyOrder(99, 100, 101);

        JSONArray amounts = documentContext.read("$..amount");
        assertThat(amounts).containsExactlyInAnyOrder(123.45, 100.0, 150.00);
    }*/
}