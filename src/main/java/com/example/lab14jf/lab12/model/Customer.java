package com.example.lab14jf.lab12.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Customer {

    private int id;
    private String name;
    private String lastName;
    private String adress;



    @Override
    public String toString() {
        return name + " " +
                lastName + ", adress: " +
                adress;
    }
}
