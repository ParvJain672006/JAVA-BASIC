package OOPS.oops4.polymorphism;

public class Main {
     public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();

        circle.area();
        square.area();
        triangle.area();
        shape.area();
     }
}
