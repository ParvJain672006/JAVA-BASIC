// run time polymorphism 
// method overriding means redifining a parent class method  inside a child class with the same name , return type 
// both method should be identical 
// override 
class Animal {
    void sounnd() {
        System.out.println("Animal makes soudn ");
    }
}

class Dog extends Animal {
    
    void sounnd() {
        System.out.println("barks");
    }
}

public class MEthodoverriding {
    public static void main(String args[]) {
        Animal a = new Animal();
        Animal b = new Dog();
        a.sounnd();
        b.sounnd();
    }
}
