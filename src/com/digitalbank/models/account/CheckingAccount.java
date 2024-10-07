package com.digitalbank.models.account;

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
