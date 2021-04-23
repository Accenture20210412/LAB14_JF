package com.example.lab14jf.lab12.resources;



import com.example.lab14jf.lab12.model.Customer;
import com.example.lab14jf.lab12.model.trip.Trip;

import java.time.LocalDate;
import java.util.List;

public interface ITrips {

    boolean add(Trip trip);

    List<Trip> findByName(String name);

    List<Trip> after(LocalDate localDate);

    List<Trip> findByDestination(String destination);

    boolean singUp(Trip trip, Customer customer);

    boolean singOut(Trip trip, Customer customer);
}
