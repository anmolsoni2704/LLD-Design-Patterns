package main.java.adapterPattern;

public class Phonepe {
    private static BankAPI bankAPI = new ICICIBankAdapter();

    public static void main(String[] args) {
        bankAPI.sendMoney("1234", "9876", 1000);
    }
}
