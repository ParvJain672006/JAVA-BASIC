package OOPs.Inheritance;

public class Dog extends Animal {
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