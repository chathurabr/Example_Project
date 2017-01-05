package com.examples.exetel;

/**
 * Created by Chathura on 1/5/2017.
 */
public class Creditbalace {

    private double balance;

    public Creditbalace() {
      //  balance = 0;
        //newBalance = getBalance();
    }

    public Creditbalace(double initialBalance) {
        balance = initialBalance;
    }


    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;

    }









}

