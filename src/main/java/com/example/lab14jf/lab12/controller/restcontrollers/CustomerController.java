package com.example.lab14jf.lab12.controller.restcontrollers;


import com.example.lab14jf.lab12.model.Customer;
import com.example.lab14jf.lab12.resources.ICustomers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    public void adddd(){
        customers.add(new Customer("imie", "nazwisko", "adres"));
    }
    @Autowired
    private ICustomers customers;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        adddd();
        return this.customers.getCustomers();
    }

    @PostMapping("/addCustomer")
    @ResponseStatus(HttpStatus.CREATED)
    public void addOne(@RequestBody  Customer customer) {
        customers.add(customer);
    }
}
