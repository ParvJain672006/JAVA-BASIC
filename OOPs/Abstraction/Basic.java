//  it is the concept of hiding  the implemeantation  details and showing onl the essential features of the object 
// Abstract class - Interfaces
// Abstract class => a class that cannot be initallized on theri own , it can be initaliz by (Abstract method ) or (concrete method ){with a body }
//{ without body }
// an  abstract method with keywtord has no implementation in parent through  child classes  can modify this method  as they want ( for ex - dog->bark , cat-> meowwww  )

// concrete method is a method which has complete freedom of implementation 
// any subclass / child can use this method as it is , or override it 
// abstract class animal is now serving as a blue print for all other child classes

// abstract keyword here means , you can't create an object of class Animal directly 
// abstract classess are meant to be inheriated by other classes




abstract class Animal {
    abstract void Sound();
    void sleep(){
        System.out.println("Animal sleeping");
    }
}


public class Basic {
    
}
