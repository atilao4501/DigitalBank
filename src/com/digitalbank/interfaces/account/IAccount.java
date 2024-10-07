package com.digitalbank.interfaces.account;

public interface IAccount {

    void put(double value);

    void withdraw(double value);

    void transfer(double value, IAccount contaDestino);

    void printStatement();
}
