package com.example.bookmyshow2024.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

@Entity(name="payments")
public class Payment extends BaseModel{

    private int amount;
    private String referenceNo;

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;

    @Enumerated(EnumType.ORDINAL)
    private PaymentGateway paymentGateway;

    @Enumerated(EnumType.ORDINAL)
    private PaymentMode paymentMode;

    @ManyToOne
    private Booking booking;

}
