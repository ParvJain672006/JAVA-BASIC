// (compile time polymorphism) defining multiple with the same name 
// requirements 
// 1 method name must be the same 
// 2 parameters type , num , orders shoould be different
// 3 can have different return types 


class Calculator{
    int add (int a , int b ){
        return a + b ;

        
    }


 double add( double a , double b ){
    return a + b ;

 }
  int add ( int a , int b , int c ){
    return a+b+c;
  }
}

public class Calculatorr {
    public static void main ( String args []){
        Calculator c1 = new Calculator();
        System.out.println(c1.add(2,3));
        System.out.println(c1.add(2,3));
        System.out.println(c1.add(2,3,4));
    }
    
}
