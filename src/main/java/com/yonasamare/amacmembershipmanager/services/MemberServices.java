package com.yonasamare.amacmembershipmanager.services;

import com.yonasamare.amacmembershipmanager.helpers.MemberUtilityFunctions;
import com.yonasamare.amacmembershipmanager.jpa.MemberRepository;
import com.yonasamare.amacmembershipmanager.records.Confirmation;
import org.springframework.beans.factory.annotation.Autowired;
import com.yonasamare.amacmembershipmanager.jpa.Member;

public class MemberServices {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    MemberUtilityFunctions utilityFunctions;

    public Confirmation saveMember(Member member) {
        Member newMember = memberRepository.save(member);
        return utilityFunctions.formConfirmationMessage(newMember);
    }
}
