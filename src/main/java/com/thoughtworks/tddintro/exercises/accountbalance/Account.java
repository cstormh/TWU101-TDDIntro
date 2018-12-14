package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {

    private int balance;
    private int deposit;
    private int withdraw;

    public Account(){
        this.balance = 100;
        this.deposit = 50;
        this.withdraw = 50;
    }

    public int getBalance(){
        return balance;
    }

    public int setDeposit() {
        balance += deposit;
        return balance;
    }

    public int setWithdraw() {
        balance -= withdraw;
        return balance;
    }

}
