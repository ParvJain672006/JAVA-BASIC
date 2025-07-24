//Write a method that takes a String array and returns the longest string

// Inheritance example with multiple animal classes

class Animal {
    String name;
    int age;
    
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Dog extends Animal {
    String breed;
    
    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
    
    void fetch() {
        System.out.println(name + " is fetching the ball");
    }
}

class Cat extends Animal {
    String color;
    
    Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow! Meow!");
    }
    
    void climb() {
        System.out.println(name + " is climbing the tree");
    }
}

public class Five {
    public static void main(String args[]) {
        // Create a Dog object
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");
        System.out.println("Dog Information:");
        myDog.displayInfo();
        myDog.makeSound();
        myDog.fetch();
        
        System.out.println("\n-------------------\n");
        
        // Create a Cat object
        Cat myCat = new Cat("Whiskers", 2, "Orange");
        System.out.println("Cat Information:");
        myCat.displayInfo();
        myCat.makeSound();
        myCat.climb();
    }
}
