package OOPS3.INTROO;

public class InheritanceONE {
    double e ;
    double w;
    double h ;
    InheritanceONE(){
        this.e=-1;                                       // default constructor
        this.w=-1;
        this.h = -1;

    }

    InheritanceONE(double side){
        this.e = side ;
        this.w= side;                                 // parameter constructor
        this . h = side;

    }
    public InheritanceONE(double e , double w, double h ){
        this.e=e;
        this.w=w;                                             // passing all 3 argumnet 
        this.h = h;


    }
    InheritanceONE(InheritanceONE old){
        this.e= old.e;
        this.w= old.w;
        this.h = old.h;                               // copy constructor 
    }

    public void information(){
        System.out.println("running the box ");

    }

    
    
}


// inheritance , simply defines inheriting or deriving properties from the parent class by  the child  class 
// any class derived from the base class is the child class 
// child class inherits properties ( variables , methodS  ) fromm the baseclass  
// " extends" key word is the basic b/w base case and the child class----->>

//  now the chld class has all the properties of the base class  + properties of their own 

// when defining the constructor , you also need  to initalize parent  class  variable also 
