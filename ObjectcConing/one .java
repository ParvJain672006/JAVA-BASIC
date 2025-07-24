package objectcloningg; // no spaces allowed in package names

public class Human {                              // constructor default 
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(Human other) {                    // copy constructor //  the class has been pased as an object 
        this.age = other.age;
        this.name = other.name;
    }

    @Override    // ths
    protected Object clone() throws CloneNotSupportedException {        // exception 
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {      // exception handling 
        Human one = new Human(20, "john");
        Human two = new Human(one);
        System.out.println(two.age + " " + two.name);


}


// 1 .) FIRST ONE CELL THE NORMAL CONSTRUCTOR & 2 ND ONE CALLS THE COPY CONSTRUCTOR 
//2 .) I JAVA THERE'S AN INTERFACE  CLONEABLE - > IMPLEMENTED IN HUMAN.JAVA  FILE 
// 3.) HUMAN TWIN  = NEW HUMAN S1()     // WRONG 
// 4 .) CLONE WILL ACTUALLY COPY  THE VALUE FROM NE OBJECT TO OTHER OBJECT 
// 5 .)  IMPLEMENTS CLONABLE - > JUST TO TELL JAVA THAT WE ARE JUST PERFORMING CLONE ON THE OBJECT OF THETYPE HUMAN 
// 6.) WITH " CLONEABLE INTERFACE " -> SUPER.CLONE()-> WILL THROW AN ERROR 


