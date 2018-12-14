package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {

    private int balance;
    private int newBalance;

    public Account(){
        this.balance = 100;
    }

    public int getBalance(){

        return balance;
    }

    public int setDeposit(int deposit) {
        newBalance = balance + deposit;
        return newBalance;
    }

    public int setWithdraw(int withdraw) {
        if (withdraw > balance) {
            return balance;
        }
        else {
            newBalance = balance - withdraw;
            return newBalance;
        }
    }

}
