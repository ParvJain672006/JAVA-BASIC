
// call parent class method (Super argument)


class Animal {
    String name  ;
    Animal (String name ){
        this.name = name;
        System.out.println("animal " + name);

    }

}

class Dog extends Animal{
    Dog (String name ){
        super(name);
        System.out.println(" dog barks ");
    }

}
public class SUPERargumentss {
    public static void main ( String args []){
        Dog tom =  new Dog ("buddy");

    }
    
    
}
