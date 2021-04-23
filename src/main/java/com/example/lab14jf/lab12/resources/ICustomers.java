package com.example.lab14jf.lab12.resources;



import com.example.lab14jf.lab12.model.Customer;

import java.util.List;

public interface ICustomers {

    List<Customer> getCustomers();

    void add(Customer customer);

    void remove(Customer customer);

    String display();

    List<Customer> contain(String name);
}
