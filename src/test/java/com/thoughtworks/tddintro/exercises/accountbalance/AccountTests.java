package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){

        Account account = new Account();
        int myBalance = account.getBalance();
        int myNewBalance = account.setDeposit(50);
        Assert.assertTrue(myNewBalance > myBalance);
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){

        Account account = new Account();
        int myBalance = account.getBalance();
        int myNewBalance = account.setWithdraw(50);
        Assert.assertTrue(myNewBalance < myBalance);

    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

        Account account = new Account();
        int myBalance = account.getBalance();
        int myNewBalance = account.setWithdraw(myBalance+10);
        Assert.assertTrue(myBalance-myNewBalance==0);
    }
}
