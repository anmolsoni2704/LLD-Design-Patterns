package main.java.SOLIDPrinciples.Single_Responsibility_Principle;

public class Client {
    public static void main(String[] args) {
        InvoicePrinter invoicePrinter = new InvoicePrinter();
        invoicePrinter.printInVoice();

        InvoiceSaver invoiceSaver = new InvoiceSaver();
        invoiceSaver.saveInvoice();
    }
}
