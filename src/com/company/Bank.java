package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    //State
    private List<Customer> Customers;

    //Constructor
    public Bank (List<Customer> customers){
        Customers = customers;
    }

    //Behavior


    //public void add(Customer customer) {}


// getCustomers i uppgiften
    public List<String> getCustomersInfo(){
        List<String> info = new ArrayList<>();
        for(var Customer : Customers)
        {

            String customersInfo = "Kundens Namn: " + Customer.getName() + "\n" +
                    "Personnummer: " + Customer.getPersonnummer() + "\n" +
                    "Antal Bankkonton: " + String.valueOf(Customer.getAccounts().size()) + "\n";
            info.add(customersInfo);

        }
        return info;
    }
}
