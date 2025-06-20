package main.java.SOLIDPrinciples.Liskov_Substitution_Principle;

public class Client {
    public static void main(String[] args){
        Square square = new Square(10.0);
        System.out.println(square.calculateArea());

        Rectangle rectangle = new Rectangle(10.0, 20.0);
        System.out.println(rectangle.calculateArea());
    }
}
