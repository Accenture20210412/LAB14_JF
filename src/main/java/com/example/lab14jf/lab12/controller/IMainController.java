package com.example.lab14jf.lab12.controller;


import com.example.lab14jf.lab12.model.Customer;
import com.example.lab14jf.lab12.model.trip.Trip;

import java.time.LocalDate;

public interface IMainController {

    void addCustomer(Customer customer);

    void removeCustomer(String name);

    void signUp(int customerId, Trip trip);

    /**
     * Decyzja o dodatkowej opcji wypisania customera z wycieczki
     * @param customer
     * @param trip
     */
    void signOut(int customerId, Trip trip);

    void displayCustomers();

    void addTrip(Trip trip);

    void findTripByName(String name);

    void findTripLater(LocalDate date);

    void findTripByDestination(String destiny);

}
