package com.company;

public class Account {
    //State
    private String Typ;
    private int Kontonummer;
    private int Saldo;

    //Constructor
    public Account(int kontonummer){
        Typ="Debit";
        Kontonummer=kontonummer;
        Saldo=0;
    }

    //Behavior Getter
    public int getKontonummer() {
        return Kontonummer;
    }
    public int getSaldo() {
        return Saldo;
    }
    public String getTyp() {
        return Typ;
    }

    public boolean Deposit(int amount) {
        if (amount > 10000) {
            System.out.println("Du kan inte sätta in mer än 10000 kr på kontot");
            return false;
        } else {
            Saldo = Saldo + amount;
            System.out.println(amount + " kr har satts in på ditt konto");
            return true;
        }
        }
    public boolean Withdraw (int amount){
        if (amount < Saldo){
            Saldo = Saldo - amount;
            System.out.println("Du har tagit ut " + amount + " kr från ditt konto");
            return true;
        }
        else {
            System.out.println("Du har inte tillräckligt med pengar på kontot");
            return false;}
    }
    public String AccountInfo(){
        String accInfo = "Kontonummer: " + Kontonummer + "\n" +
                "Kontotyp: " + Typ +"\n" +
                "Saldo: " + Saldo;
        return accInfo;
    }

    }