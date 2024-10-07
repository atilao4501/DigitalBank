package com.digitalbank.models.account;

import com.digitalbank.interfaces.account.IAccount;

public abstract class BaseAccount implements IAccount {

    private static final int DEFAULT_AGENCY = 1;

    private static int SEQUENCIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;

    public BaseAccount(Client client) {
        this.agency = DEFAULT_AGENCY;
        this.number = SEQUENCIAL++;
        this.client = client;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public void put(double value) {
        balance += value;
    }

    @Override
    public void withdraw(double value) {
       balance -= value;
    }

    @Override
    public void transfer(double value, IAccount destinationAccount) {
        this.withdraw(value);
        destinationAccount.put(value);
    }

    protected void printCommonInfos(){
        System.out.println(String.format("Account holder: %s", this.client.getName()));
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Account number: %d", this.number));
        System.out.println(String.format("Balance: %.2f", this.balance));

    }
}
