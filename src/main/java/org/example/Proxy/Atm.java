package org.example.Proxy;

public class Atm implements Account{
    @Override
    public void withdrawMoney() {
        // perform some businees logic before accessing the bank account object

        BankAccount bankAccount = new BankAccount();
        bankAccount.withdrawMoney();
    }

    @Override
    public void getAccountNumber() {

    }
}
