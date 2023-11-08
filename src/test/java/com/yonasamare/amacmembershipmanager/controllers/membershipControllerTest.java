package com.yonasamare.amacmembershipmanager.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles({"local"})
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class membershipControllerTest {

    @Autowired
    TestRestTemplate restTemplate;
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
    }
}