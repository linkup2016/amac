package com.yonasamare.amacmembershipmanager.records;

import com.yonasamare.amacmembershipmanager.jpa.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "CREDIT_CARD_DETAILS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCardDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CREDIT_CARD_ID")
    private Long creditCardId;

    @Column(name = "CARDHOLDER_NAME")
    private String cardholderName;

    @Column(name = "CARD_NUMBER")
    private String cardNumber;

    @Column(name = "EXPIRATION_DATE")
    @Temporal(TemporalType.DATE)
    private Date expirationDate;

    @Column(name = "CVV")
    private String cvv;

    @Column(name = "BILLING_ADDRESS")
    private String billingAddress;

    @Column(name = "CREDIT_LIMIT")
    private Double creditLimit;

    @Column(name = "PAYMENT_DETAILS_ID")
    private Long paymentDetailsId;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    @ManyToOne
    @JoinColumn(name = "PAYMENT_DETAILS_ID", referencedColumnName = "PAYMENT_DETAILS_ID", insertable = false, updatable = false)
    private PaymentDetails paymentDetails;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID", referencedColumnName = "MEMBER_ID", insertable = false, updatable = false)
    private Member member;
}

