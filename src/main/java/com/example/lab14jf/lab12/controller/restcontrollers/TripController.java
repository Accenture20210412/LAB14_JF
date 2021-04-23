package com.example.lab14jf.lab12.controller.restcontrollers;


import com.example.lab14jf.lab12.model.Customer;
import com.example.lab14jf.lab12.model.trip.Trip;
import com.example.lab14jf.lab12.resources.ITrips;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/trips")
public class TripController {

    @Autowired
    private ITrips trips;


    public void add(){
        trips.add(new Trip("name", LocalDate.now(), LocalDate.now(), "span", BigDecimal.ONE));

    }
    @GetMapping
    public Map<Trip, List<Customer>> display() {
        add();
        return trips.getTrips();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addTrip(@RequestBody Trip trip) {
        trips.add(trip);
    }

    @GetMapping("/tripsByName/{name}")
    public List<Trip> findByName(@PathVariable String name) {
        return trips.findByName(name);
    }

    @GetMapping("/tripsByDestination/{destination}")
    List<Trip> findByDestination(@PathVariable String destination){
        return trips.findByDestination(destination);
    }
}
