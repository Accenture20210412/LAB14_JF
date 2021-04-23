//package com.example.lab14jf.lab12.controller.restcontrollers;
//
//
//import com.example.lab14jf.lab12.controller.IMainController;
//import com.example.lab14jf.lab12.model.Customer;
//import com.example.lab14jf.lab12.model.trip.Trip;
//import com.example.lab14jf.lab12.resources.ICustomers;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/customers")
//
//
//public class CustomerController {
//
//
//    @Autowired
//    private ICustomers customers;
//
//
//    @GetMapping
//    public List<Customer> getAllCustomers() {
//        return this.customers.getCustomers();
//    }
//TODO::
//    @GetMapping()
////    public Customer getCustomerById(@RequestBody int id) {
//        return customers.getById(id);
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public void addOne(@RequestBody  Customer customer) {
//        customers.add(customer);
//    }
//
//    @DeleteMapping
//    @ResponseStatus(HttpStatus.GONE)
//    public void removeOne(@RequestBody Customer customer) {
//        customers.remove(customer);
//    }
//
//
//    @DeleteMapping("/{name}")
//    @ResponseStatus(HttpStatus.GONE)
//    public void removeByName(@PathVariable String name) {
//        List<Customer> matchingResults = customers.contain(name);
//        Customer customer = matchingResults.get(0);
//        customers.remove(customer);
//    }
//
//
//}
