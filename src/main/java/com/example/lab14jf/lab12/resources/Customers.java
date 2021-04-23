package com.example.lab14jf.lab12.resources;


import com.example.lab14jf.lab12.model.Customer;
import lombok.Getter;


import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Getter

public class Customers implements ICustomers {

    List<Customer> customers = new LinkedList<>();


    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void remove(Customer customer){
        customers.remove(customer);
    }

    @Override
    public String display(){
        StringBuilder result = new StringBuilder();
        result.append("Office customers: \n");
        for (Customer i : customers) {
            result.append(i.toString())
                    .append("\n");
            }
        return result.toString();
    }

    @Override
    public List<Customer> contain(String name) {
        List<Customer> collect = customers
                .stream()
                .filter(n -> isMatching(name, n))
                .collect(Collectors.toList());
        return collect;
    }

    private boolean isMatching(String name, Customer n) {
        return n.getName().contains(name) ||
                n.getLastName().contains(name);
    }
}
