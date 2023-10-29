package com.yonasamare.amacmembershipmanager.jpa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "MEMBERS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_id_seq")
    @SequenceGenerator(name = "member_id_seq", sequenceName = "MEMBER_ID_SEQ", allocationSize = 1)
    @Column(name = "MEMBER_ID")
    private Integer id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Generated(GenerationTime.INSERT)
    @Column(name = "ENROLLMENT_DATE", insertable = false, updatable = false)
    private Date enrollmentDate;

    @Column(name = "STREET_ADDRESS")
    private String streetAddress;

    @Column(name = "APARTMENT")
    private String apartment;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String state;

    @Column(name = "ZIP_CODE")
    private String zipCode;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "CONTRIBUTION")
    private Double contribution;

    @Column(name = "CONTRIBUTION_FREQUENCY")
    private String contributionFrequency;

    @Column(name = "PAYMENT_OPTION")
    private String paymentOption;

    @Column(name = "VOLUNTARY_AREA_CONTRIBUTION")
    private String areaOfContribution;

//    @Column(name = "PREFERRED_COMMUNICATION_WAYS")
//    private List<String> preferredCommunication;
}

