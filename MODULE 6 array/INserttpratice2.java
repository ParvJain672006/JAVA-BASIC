public class INserttpratice2 {
    public  static void main ( String args []){


        // CREATE AN OBJECT  ARRAY WITH DIFFERENT DATA TYPE

        Object[] MixedArray={123, "java " , 45.66 , "true", 'a' };

        // S-2 covert each elements to string 

        String str = element.toString();
        System.out.println("convert to String : " + str);

        // 1.) object mixedarray = {  } => this create an array that can hold any type of data , since everything in java extends object 
        // 2.) elements.toString()   => every class in java inherits the toString() method from the object class 
        // 3.) primitive values like int , boolean etc  , are autobased into their wrapper classes( integer  , Boolean ) , which override to String() to return a readable String form
    }
    
}
