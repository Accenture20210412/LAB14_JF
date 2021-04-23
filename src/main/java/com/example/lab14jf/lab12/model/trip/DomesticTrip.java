package com.example.lab14jf.lab12.model.trip;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Getter
@Setter

public class DomesticTrip extends Trip{

    private BigDecimal selfAproachDiscount;

    public DomesticTrip(String uniqueName,
                        LocalDate startOfTrip,
                        LocalDate endOfTrip,
                        String destiny,
                        BigDecimal price,
                        BigDecimal selfAproachDiscount) {
        super(uniqueName, startOfTrip, endOfTrip, destiny, price);
        this.selfAproachDiscount = selfAproachDiscount;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", include discount (" + this.selfAproachDiscount + "$)";
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().subtract(selfAproachDiscount);
    }
}
