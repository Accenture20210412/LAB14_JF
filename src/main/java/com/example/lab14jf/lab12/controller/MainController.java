package com.example.lab14jf.lab12.controller;


import com.example.lab14jf.lab12.model.Customer;
import com.example.lab14jf.lab12.model.trip.Trip;
import com.example.lab14jf.lab12.resources.Customers;
import com.example.lab14jf.lab12.resources.ICustomers;
import com.example.lab14jf.lab12.resources.ITrips;
import com.example.lab14jf.lab12.resources.Trips;

import java.time.LocalDate;
import java.util.List;



public class MainController implements IMainController {

    private ICustomers customers = new Customers();
    private ITrips trips = new Trips();


    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer added.");
    }


    @Override
    public void removeCustomer(String name) {
        List<Customer> matchingResults = customers.contain(name);
        if(matchingResults.size() == 0) {
            System.out.println("Customer not found!");
        }
        if(matchingResults.size() > 1) {
            System.out.println("More than one matching result");
        }
        Customer customerToRemove = matchingResults.get(0);
        System.out.printf("Customer removed: %s %n", customerToRemove );
        customers.remove(customerToRemove);

    }


    @Override
    public void signUp(Customer customer, Trip trip) {
        if(trips.singUp(trip, customer)){
            System.out.println("Customer signed up.");
        }
        System.out.println("Operation failed");
    }

    @Override
    public void signOut(Customer customer, Trip trip){
        if(trips.singOut(trip, customer)){
            System.out.println("Customer signed out");
        }
        System.out.println("Operation failed");
    }

    @Override
    public void displayCustomers() {
        System.out.println(customers.display());
    }

    @Override
    public void addTrip(Trip trip) {
        if (trips.add(trip)) {
            System.out.println("Trip added");
        }
        System.out.println("Operation failed");
    }

    @Override
    public void findTripByName(String name) {
        List<Trip> matchingNames;
        matchingNames = trips.findByName(name);
        int amountResults = matchingNames.size();
        if(amountResults == 0) {
            System.out.println("Didn't find a trip");
        }
        if(amountResults > 1) {
            System.out.println("More than one matching result");
        }
        System.out.println(matchingNames.get(0).toString());
    }

    @Override
    public void findTripLater(LocalDate date) {
        List<Trip> laterTrips;
        laterTrips = trips.after(date);
        System.out.printf("Trips after %t%n", date);
        laterTrips.forEach(System.out::println);
    }

    @Override
    public void findTripByDestination(String destination) {
        List<Trip> tripsToDestination;
        tripsToDestination = trips.findByDestination(destination);
        System.out.printf("Trips to %s%n", destination);
        tripsToDestination.forEach(System.out::println);
    }

}
