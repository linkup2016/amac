package com.yonasamare.amacmembershipmanager.records;

import com.yonasamare.amacmembershipmanager.jpa.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CASH_PAYMENT_DETAILS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CashPaymentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CASH_PAYMENT_ID")
    private Long cashPaymentId;

    @Column(name = "PAYMENT_DETAILS_ID")
    private Long paymentDetailsId;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    @Column(name = "RECEIPT_NUMBER")
    private String receiptNumber;

    @ManyToOne
    @JoinColumn(name = "PAYMENT_DETAILS_ID", referencedColumnName = "PAYMENT_DETAILS_ID", insertable = false, updatable = false)
    private PaymentDetails paymentDetails;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID", referencedColumnName = "MEMBER_ID", insertable = false, updatable = false)
    private Member member;
}

