package main.java.SOLIDPrinciples.Liskov_Substitution_Principle;

public class Square implements Shape {
    private final double length;

    public Square(double length){
        this.length = length;
    }


    @Override
    public double calculateArea() {
        return length * length;
    }
}
