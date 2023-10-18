package com.yonasamare.amacmembershipmanager.services;

import com.yonasamare.amacmembershipmanager.jpa.Member;
import com.yonasamare.amacmembershipmanager.jpa.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberServices {

    @Autowired
    private MemberRepository memberRepository;

    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }
}
