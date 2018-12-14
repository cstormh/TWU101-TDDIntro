package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){

        Account account = new Account();
        int myBalance = account.getBalance();
        int myNewBalance = account.setDeposit();
        Assert.assertTrue(myNewBalance > myBalance);
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){

        Account account = new Account();
        int myBalance = account.getBalance();
        int myNewBalance = account.setWithdraw();
        Assert.assertTrue(myNewBalance < myBalance);

    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

    }
}
