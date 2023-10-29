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
        utilityFunctions.generateMembershipID(32452345);
    }
}
