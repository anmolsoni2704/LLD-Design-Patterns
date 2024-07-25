package main.java.adapterPattern;

import main.java.adapterPattern.thirdParty.iciciBank.ICICIBank;

public class ICICIBankAdapter implements BankAPI{
    private ICICIBank iciciBank = new ICICIBank();

    @Override
    public void sendMoney(String from, String to, int amount) {
        iciciBank.makePayment(to, from, amount);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public long getBalance(String accountNumber) {
        return 0;
    }
}