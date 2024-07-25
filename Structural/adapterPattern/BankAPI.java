package main.java.adapterPattern;

public interface BankAPI {
    public void sendMoney(String from, String to, int amount);

    public void registerAccount(String accountNumber);

    public long getBalance(String accountNumber);
}
