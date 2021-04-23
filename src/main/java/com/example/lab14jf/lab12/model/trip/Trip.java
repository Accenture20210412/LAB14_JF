package com.example.lab14jf.lab12.model.trip;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor

public class Trip {

    private String uniqueName;
    private LocalDate startOfTrip;
    private LocalDate endOfTrip;
    private String destination;
    private BigDecimal price;


    @Override
    public String toString() {
        return  "Trip to: " + destination +
                ", date: " + startOfTrip +
                " - " + endOfTrip +
                ", cost: " + this.getPrice() +
                "$";
    }
}
