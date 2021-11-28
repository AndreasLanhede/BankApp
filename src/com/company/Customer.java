package com.company;


import java.util.ArrayList;
import java.util.List;

//State
public class Customer {
    private String Name;
    private Long Personnummer;
    private List<Account> Accounts;

//Constructor
public Customer(Long personnummer, String name) {
    Name=name;
    Personnummer=personnummer;
}
public Customer(Long personnummer, String name, List<Account> accounts) {
        Name=name;
        Personnummer=personnummer;
        Accounts=accounts;
    }

//Behavior
public List<Account> getAccounts() {
        return Accounts;
    }


public void AddAccount(Account Account){
    Accounts.add(Account);
    }
    public String getName() {
        return Name;
    }
    public Long getPersonnummer() {
        return Personnummer;
    }
    public List<String> CustomerInfo(){

        List<String> info2 = new ArrayList<>();
        {
            String customerInfo1 = "Namn: " + Name + "  " + "Personnummer: " + Personnummer + "\n";
            info2.add(customerInfo1);
        }
        for(var Account : Accounts)
        {
            String customerInfo2 = "Konto:" + "\n" + Account.AccountInfo()+ "\n";
            info2.add(customerInfo2);

        }
        return info2;
    }


    /*public String CloseAccount(long personnummer, int kontonummer){
        if(){

        return Name;
        }
        else{
            return Name;
        }
    }*/

    /*public boolean ChangeCustomerName(String name, Long personnummer){
    return name;
    }*/
}
