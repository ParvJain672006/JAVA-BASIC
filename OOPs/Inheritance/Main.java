package OOPs.Inheritance;

public class Main {
    public static void main(String args[]) {
        Dog myDog = new Dog();
        myDog.eat();    // Inherited from Animal
        myDog.sleep();  // Inherited from Animal
        myDog.bark();   // Dog's own method
    }
} 