//  call parent class method( Super.method name ())
class Animal{
    String type = "generic Animal ";
}

class Dog extends Animal {
    String type = "dog";
    void printype(){
        System.out.println(" Subclass Type");
        System.out.println("parent class type :" + super.type);
    }
}

public class SuperMethoddnames {
    public static void main (String agrs[]){
        Dog mydog = new Dog();
        mydog.printype();
    }
}

