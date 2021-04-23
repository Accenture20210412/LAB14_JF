package com.example.lab14jf.lab12.model.trip;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Getter

public class AbroadTrip extends Trip{

    private BigDecimal insurance;

    public AbroadTrip(String uniqueName, LocalDate startOfTrip, LocalDate endOfTrip, String destiny, BigDecimal price) {
        super(uniqueName, startOfTrip, endOfTrip, destiny, price);
    }


    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(insurance);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", include insurence (" + this.insurance +"$)";
    }
}
