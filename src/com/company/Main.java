package com.company;


import java.util.ArrayList;
import java.util.List;


public class Main {



    public static void main(String[] args) {
        List<Account> A1 = new ArrayList<>();
        List<Account> A2 = new ArrayList<>();
        Customer Andreas = new Customer(19890630L, "Andreas Lanhede", A1);
        Customer Anna = new Customer(19880503L, "Anna Svensson", A2);
        Account A1001 = new Account(1001);
        Account A1002 = new Account(1002);
        Account A1003 = new Account(1003);
        A1.add (A1001);
        A1.add (A1002);
        A2.add (A1003);
        List<Customer> Cl1 = new ArrayList<>();
        Bank AndreasBank = new Bank(Cl1);
        Cl1.add(Andreas);
        Cl1.add(Anna);




        //Testar getCustomerInfo, getCustomers och AccountInfo
        System.out.println(AndreasBank.getCustomersInfo());
        System.out.println(A1001.AccountInfo());

        // Testar deposit och Withdraw
        A1001.Deposit(5000);
        System.out.println(A1001.AccountInfo());
        A1001.Deposit(15000);
        System.out.println(A1001.AccountInfo());
        A1001.Withdraw(2000);
        System.out.println(A1001.AccountInfo());
        A1001.Withdraw(8000);
        System.out.println(A1001.AccountInfo());

        System.out.println(Andreas.getPersonnummer());
        System.out.println(Andreas.CustomerInfo());
    }
}

