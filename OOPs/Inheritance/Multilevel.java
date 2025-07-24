

// First level - Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
    
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Second level - Child of Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
    
    void run() {
        System.out.println("Dog is running");
    }
}

// Third level - Child of Dog
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy is playing");
    }
    
    void wagTail() {
        System.out.println("Puppy is wagging tail");
    }
}

// Main class
public class Multilevel {
    public static void main(String args[]) {
        // Create a Puppy object
        Puppy myPuppy = new Puppy();
        
        // Call methods from all levels
        myPuppy.eat();      // From Animal class
        myPuppy.sleep();    // From Animal class
        myPuppy.bark();     // From Dog class
        myPuppy.run();      // From Dog class
        myPuppy.play();     // From Puppy class
        myPuppy.wagTail();  // From Puppy class
    }
}
