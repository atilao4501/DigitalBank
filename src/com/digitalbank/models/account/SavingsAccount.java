package com.digitalbank.models.account;

import com.digitalbank.models.client.Client;

public class SavingsAccount extends BaseAccount{
    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("=== Statement Savings Account ===");
        super.printCommonInfos();
    }
}
