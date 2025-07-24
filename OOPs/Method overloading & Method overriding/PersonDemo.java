class Person{
    String name ;
    Person(String name ){
        this.name = name ;
    }
    void display(){
        System.out.println("Person " + name );
    }
}

class Student extends Person {
    double grade ;
    Student (String name , double grade ){
        super(name );
        this .grade = grade ;
    }
    void display (){
        System.out.println("Student "+ name +  " grade " + grade );
    }
}

public class PersonDemo {
    public static void main ( String agrs[]){
        Person p = new Person("John");
        Student s = new Student("Alice", 85.5);
        p.display();
        s.display();
    }
}

// @override for coretness 
// Student overridng display to include grade 
// override - uses different parametrs in  the same class
// overriding - redifines methods in the sub class ( child class )
