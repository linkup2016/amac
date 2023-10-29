package com.yonasamare.amacmembershipmanager.records;

import com.yonasamare.amacmembershipmanager.enums.ContributionFrequencyEnum;
import com.yonasamare.amacmembershipmanager.enums.PaymentOptionsEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MembershipApplication {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String apartment;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String email;
    private Double contribution;
    private Enum<ContributionFrequencyEnum> contributionFrequency;
    private Enum<PaymentOptionsEnum> paymentOption;
    private String areaOfContribution;
    private List<String> preferredCommunication;
}
