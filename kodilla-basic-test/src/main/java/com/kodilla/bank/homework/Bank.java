package com.kodilla.bank.homework;

public class Bank {
    private Cashmachine[] cashMachines;
    private int numberOfDevices;

    public Bank(int numberOfDevices) {
        this.cashMachines = new Cashmachine[numberOfDevices];
        this.numberOfDevices = numberOfDevices;
        for (int i = 0; i < cashMachines.length; i++) {
            cashMachines[i] = new Cashmachine();
        }
    }

    public int getNumberOfDevices() {
        return numberOfDevices;
    }

    public void addTransaction(int machineId, int amount) {
     if (machineId < cashMachines.length){
         cashMachines[machineId].addTransaction(amount);
     }
    }

    public int getBalanceOfCashmachines(){
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++){
            sum = sum + cashMachines[i].getNumberOfDeposits();
        }
        return sum;
    }

    public int getTotalNumberOfWithdrawals(){
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++){
            sum = sum + cashMachines[i].getNumberOfWithdrawals();
        }
        return sum;
    }

    public double getTotalAverageDeposits(){
        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++){
            sum = sum + cashMachines[i].getAvgDeposit();
        }
        return sum/cashMachines.length;
    }

    public double getTotalAverageWithdrawal(){
        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++){
            sum = sum + cashMachines[i].getAvgWithdrawal();
        }
        return (sum/cashMachines.length) * -1;
    }
}
