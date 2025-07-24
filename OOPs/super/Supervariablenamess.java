// access parent class variable (Super.variable name);

class Animal{
    void eat(){
        System.out.println("animal eat foodd");

    }
}
class Dog extends Animal {
    void eat (){
    super.eat();
    System.out.println("Dog extends bones ");
    }

}
public class Supervariablenamess {
    public static void main (String args[]){
        Dog tommy = new Dog();
        tommy.eat();

    }
    
}
