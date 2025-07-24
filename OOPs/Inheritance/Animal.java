package OOPs.Inheritance;

// Parent class
public class Animal {
    String name;
    int age;
    
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void eat() {
        System.out.println(name + " is eating");
    }
    
    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Child class
class Dog extends Animal {
    String breed;
    
    Dog(String name, int age, String breed) {
        super(name, age);  // Call parent constructor
        this.breed = breed;
    }
    
    void bark() {
        System.out.println(name + " is barking");
    }
    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
    }
}

// Main class
public class AnimalDemo {
    public static void main(String args[]) {
        // Create a Dog object
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");
        
        // Call methods
        myDog.displayInfo();  // Dog's own method
        myDog.eat();         // Inherited from Animal
        myDog.sleep();       // Inherited from Animal
        myDog.bark();        // Dog's own method
    }
} 