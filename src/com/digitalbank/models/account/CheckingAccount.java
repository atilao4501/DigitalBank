package com.digitalbank.models.account;

import com.digitalbank.models.client.Client;

public class CheckingAccount extends BaseAccount{

    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("=== Statement Checking Account ===");
        super.printCommonInfos();
    }
}
