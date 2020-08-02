package com.kodilla.homework;

import com.kodilla.bank.homework.Cashmachine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        Cashmachine cashMachine = new Cashmachine();
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldCountNumberOfTransactionsEvenIfInvalidTransactionTriedToBeMade(){
//invalid transaction - trying withdraw money when not enough cash in the cash machine
        Cashmachine cashMachine = new Cashmachine();
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(20);
        cashMachine.addTransaction(-20);
        cashMachine.addTransaction(10);
        assertEquals(4, cashMachine.getTransactions().length);
    }

    @Test
    public void shouldCalcBalanceEvenIfInvalidTransactionTriedToBeMade(){
//invalid transaction - trying withdraw money when not enough cash in the cash machine
        Cashmachine cashMachine = new Cashmachine();
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(20);
        cashMachine.addTransaction(-20);
        cashMachine.addTransaction(10);
        assertEquals(60, cashMachine.getBalance());
    }

    @Test
    public void shouldReturnBalanceEqualsZeroIfEmpty(){
        Cashmachine cashMachine = new Cashmachine();
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(20);
        cashMachine.addTransaction(-20);
        cashMachine.addTransaction(-150);
        assertEquals(0, cashMachine.getBalance());
    }

    @Test
    public void shouldReturnBalanceEqualsZeroIfNoTransactionsWereMade(){
        Cashmachine cashMachine = new Cashmachine();
        assertEquals(0, cashMachine.getBalance());
    }

    @Test
    public void shouldReturnAverageEqualsZeroIfNoTransactionsWereMade(){
        Cashmachine cashMachine = new Cashmachine();
        assertEquals(0.0, cashMachine.getAvgDeposit() + cashMachine.getAvgWithdrawal(), 0.01);
    }

    @Test
    public void shouldNotCountWithdrawTransactionIfEmpty(){
        Cashmachine cashMachine = new Cashmachine();
        cashMachine.addTransaction(-20);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(-50);
        assertEquals(0,cashMachine.getNumberOfWithdrawals());
    }

    @Test
    public void shouldNotCountWithdrawTransactionIfNotEnoughMoney(){
        Cashmachine cashMachine = new Cashmachine();
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(-20);
        assertEquals(2,cashMachine.getNumberOfWithdrawals());
    }

    @Test
    public void shouldReturnAverageDepositEqualsZeroIfNoDeposits(){
        Cashmachine cashMachine = new Cashmachine();
        assertEquals(0.0, cashMachine.getAvgDeposit(), 0.01);
    }

    @Test
    public void shouldReturnAverageWithdrawalEqualsZeroIfNoWithdrawals(){
        Cashmachine cashMachine = new Cashmachine();
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(20);
        assertEquals(0.0, cashMachine.getAvgWithdrawal(), 0.02);
    }
}