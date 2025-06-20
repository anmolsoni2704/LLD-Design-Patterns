package main.java.SOLIDPrinciples.Interface_Segregation_Principle;

public class Client {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.scan();
        printer.print();
    }
}
