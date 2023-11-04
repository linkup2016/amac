package com.yonasamare.amacmembershipmanager.jpa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "MEMBERS_LIST")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_id_seq")
    @SequenceGenerator(name = "member_id_seq", sequenceName = "MEMBER_ID_SEQ", allocationSize = 1)
    @Column(name = "MEMBER_ID")
    private Integer id;

    @Column(name = "ENROLLMENT_DATE")
    private Date enrollmentDate;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "CALL")
    private String callMe;

    @Column(name = "TEXT")
    private String textMe;

    @Column(name = "EMAIL_ME")
    private String emailMe;

    @Column(name = "CONTRIBUTION")
    private Double contribution;

    @Column(name = "VOLUNTARY_AREA_CONTRIBUTION")
    private String areaOfContribution;

    @Column(name = "PAYABLE_ORDER_ID")
    private String orderId;

    @Column(name = "PAYABLE_TOTAL")
    private Double totalCharged;

    @Column(name = "PAYABLE_STATUS")
    private String paymentStatus;

    @Column(name = "PAYABLE_PAYMENT_METHOD")
    private String paymentMethod;

    @Column(name = "PAYABLE_TRANSACTION_ID")
    private String transactionId;

    @Column(name = "PAYABLE_LAST_UPDATED")
    private Date lastUpdated;
}

