package main.java.strategyPattern;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Banjara Hills", "Kompally", "Car");
    }
}
