package com.yonasamare.amacmembershipmanager.helpers;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class MemberUtilityFunctions {

    private final Set<Integer> takenIdNumbers = new HashSet<>();

    public String generateMembershipID() {

        StringBuilder builder = new StringBuilder(Constants.AMAC);

        AtomicInteger seq = new AtomicInteger(Constants.STARTING_NUMBER);
        int nextVal = seq.incrementAndGet();

        String newId = builder.append(nextVal).toString();
        log.info("New Member ID generated {} ", newId);

        return newId;
    }
}
