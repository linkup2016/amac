package com.yonasamare.amacmembershipmanager.helpers;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Slf4j
public class MemberUtilityFunctionsTest {

    private MemberUtilityFunctions utilityFunctions;

    @BeforeEach
    public void setup(){
        utilityFunctions = new MemberUtilityFunctions();
    }
    @Test
    void testGenerateMembershipID(){
        log.info("Just adding some change to test the ci-cd setup on github");
        utilityFunctions.generateMembershipID(32452345);
    }
}
