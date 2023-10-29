package com.yonasamare.amacmembershipmanager.records;

import com.yonasamare.amacmembershipmanager.enums.ContributionFrequencyEnum;
import com.yonasamare.amacmembershipmanager.enums.PaymentOptionsEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PAYMENT_DETAILS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PAYMENT_DETAILS_ID_SEQ")
    @SequenceGenerator(name = "PAYMENT_DETAILS_ID_SEQ", sequenceName = "PAYMENT_DETAILS_ID_SEQ", allocationSize = 1)

    @Column(name = "PAYMENT_DETAILS_ID")
    private Integer paymentDetailsId;
    @Column(name = "MEMBER_ID")
    private Integer memberId;
    @Column(name = "PAYMENT_METHOD")
    private Enum<PaymentOptionsEnum> paymentMethod;
    @Column(name = "PAYMENT_FREQUENCY")
    private ContributionFrequencyEnum contributionFrequency;
//    @Column(name = "PAYMENT_METHOD_DETAILS")
//    private PaymentMethodDetails paymentMethodDetails;
    @Column(name = "CONTRIBUTION")
    private Double contribution;

}
