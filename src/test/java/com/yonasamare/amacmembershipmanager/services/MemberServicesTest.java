package com.yonasamare.amacmembershipmanager.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class MemberServicesTest {

    MemberServices classToTest = new MemberServices();
    @Test
    void enterRecordsFromGoogleSheets() {
        classToTest.enterRecordsFromGoogleSheets();
    }
}