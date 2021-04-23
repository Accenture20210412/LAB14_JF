package com.example.lab14jf.lab12.resources;

import com.example.lab14jf.lab12.model.Customer;
import com.example.lab14jf.lab12.model.trip.Trip;
import lombok.Getter;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Getter

public class Trips implements ITrips {
    /**
     * Rezygnacja z pola Trip w customers i przypisywanie customerów do mapy
     */

    Map<Trip, List<Customer>> trips = new LinkedHashMap<>();

    @Override
   public boolean add(Trip trip) {
        if(trips.containsKey(trip)){
            return false;
        }
        trips.put(trip, new LinkedList<>());
        return true;
    }

    @Override
    public List<Trip> findByName(String name) {
       List<Trip> matchingTrips;
       matchingTrips = trips.keySet()
               .stream()
               .filter(n -> matchName(name, n))
               .collect(Collectors.toList());
       return matchingTrips;
    }

    @Override
    public List<Trip> after(LocalDate localDate) {
       List<Trip> tripsAfterDate;
       tripsAfterDate = trips.keySet()
               .stream()
               .filter(d -> isAfter(localDate, d))
               .collect(Collectors.toList());
       return tripsAfterDate;
    }

    @Override
    public List<Trip> findByDestination(String destination) {
       List<Trip> matchingTrips;
       matchingTrips = trips.keySet()
               .stream()
               .filter(d -> matchDestination(destination, d))
               .collect(Collectors.toList());
       return matchingTrips;
    }

    @Override
    public boolean singUp(Trip trip, Customer customer) {
        if (!trips.containsKey(trip)) {
            return false;
        }
        trips.get(trip).add(customer);
        return true;
    }

    @Override
    public boolean singOut(Trip trip, Customer customer) {
        if (!trips.containsKey(trip)) {
            return false;
        }
        trips.get(trip).remove(customer);
        return true;
    }

    private boolean matchDestination(String destiny, Trip d) {
        return d.getDestination().contains(destiny);
    }

    private boolean isAfter(LocalDate localDate, Trip d) {
        return d.getStartOfTrip().isAfter(localDate);
    }

    private boolean matchName(String name, Trip n) {
        return n.getUniqueName().contains(name);
    }
}
