package main.java.SOLIDPrinciples.Interface_Segregation_Principle;

public class Printer implements Printable, Scannable {
    @Override
    public void print() {
        System.out.println("The page is printed...");
    }

    @Override
    public void scan() {
        System.out.println("The page is scanned successfully...");
    }
}
