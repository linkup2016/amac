package com.yonasamare.amacmembershipmanager.records;


import com.yonasamare.amacmembershipmanager.enums.PaymentOptionsEnum;

public class PaymentMethodDetails {
    private CreditCardDetails creditCard;
    private BankPaymentDetails bankDetails;
    private PaymentOptionsEnum zelle;
    private PaymentOptionsEnum cash;
    private PaymentOptionsEnum cashApp;
    private PaymentOptionsEnum other;
}

