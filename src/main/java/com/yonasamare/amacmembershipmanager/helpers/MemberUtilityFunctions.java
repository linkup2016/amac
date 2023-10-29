package com.yonasamare.amacmembershipmanager.helpers;

import com.yonasamare.amacmembershipmanager.jpa.Member;
import com.yonasamare.amacmembershipmanager.records.Confirmation;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Slf4j
public class MemberUtilityFunctions {
    public String generateMembershipID(Integer rawId) {
        return Constants.AMAC + rawId;
    }

    public Confirmation formConfirmationMessage(Member newMember) {
        Confirmation confirmation = new Confirmation();
        confirmation.setMemberId(generateMembershipID(newMember.getId()));
        confirmation.setFirstName(newMember.getFirstName());
        confirmation.setLastName(newMember.getLastName());
        Date enrollmentDate = newMember.getEnrollmentDate();
        confirmation.setEnrollmentDate(enrollmentDate);
        String date = String.valueOf(enrollmentDate).replace("-", "");
        String rawId = String.valueOf(newMember.getId());

        confirmation.setConfirmationNumber((rawId + "-" + date));

        String message = "Congratulations " + confirmation.getFirstName() + " " + confirmation.getLastName() +
                " " + "your membership application has been accepted." + " Your confirmation number is " + confirmation.getConfirmationNumber() +
                " and your contribution is due " + newMember.getContributionFrequency() + " as of today.  Thank you for becoming a member.";
        confirmation.setMessage(message);

        return confirmation;
    }
}
