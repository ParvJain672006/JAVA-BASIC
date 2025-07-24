package OOPs.Inheritance;

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
    
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
public class AnimalDemo {
    public static void main(String args[]) {
        Dog myDog = new Dog();
        myDog.eat();    // Inherited from Animal
        myDog.sleep();  // Inherited from Animal
        myDog.bark();   // Dog's own method
    }
}
