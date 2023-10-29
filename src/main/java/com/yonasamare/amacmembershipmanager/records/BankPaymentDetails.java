package com.yonasamare.amacmembershipmanager.records;

import com.yonasamare.amacmembershipmanager.jpa.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@Table(name = "BANK_PAYMENT_DETAILS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankPaymentDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BANK_PAYMENT_ID")
    private Long bankPaymentId;

    @Column(name = "PAYMENT_DETAILS_ID")
    private Long paymentDetailsId;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;

    @Column(name = "ROUTING_NUMBER")
    private String routingNumber; // New column for routing number

    @Column(name = "BANK_NAME")
    private String bankName;

    @ManyToOne
    @JoinColumn(name = "PAYMENT_DETAILS_ID", referencedColumnName = "PAYMENT_DETAILS_ID", insertable = false, updatable = false)
    private PaymentDetails paymentDetails;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID", referencedColumnName = "MEMBER_ID", insertable = false, updatable = false)
    private Member member;
}

