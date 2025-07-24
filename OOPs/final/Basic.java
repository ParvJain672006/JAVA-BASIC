// it prevent modification ;
// 1. final class - can't be entended 
// 2. final method - cant be overridden
// 3 . final variable - constant 
 final class vehicle{
    final String brand = "generic ";
    void describe(){
    System.out.println(" btand " + brand );

 }
}
class car extends vehicle {
    String model;
     car ( String model){
        this.model= model;

     }
      // overriden 
      void describe (){
        super.describe(){
            System.out.println("model" + model);

        }
      }
}


public class Basic {
     public static void main ( String agrs [] ){
        car toyota = new car("seedan");
        toyota.describe();


     }
    
}  

// this code will give error 
// if you want to run code remoove all final from the code 
