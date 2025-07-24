package BASICCC;
import java.util.*;

public class THree {
    public static void main (String args[]){
        System.out.println('a' + 'b');
        // the operator behind the scene is converting a -> ASCII vaues 

        System.out.println("a" + "b");
        // here string concatenation is taking place 

        System.out.println('a' + 3);
        System.out.println("a" +1);
        // integer will be converted to the integer that  will call toString()

        System.out.println("parv" + new ArrayList<>());
        // you will see an empty array 
         
        System.out.println(new integer() + new Arraylist<>());
        // for this , you will be seeing an error because (+) operator in java is only defined for primitive data types  & if one of these value is a strinng 
    
    // to correct upper case error 
        System.out.println(new Integer() + "  "+ new Arraylist<>());
}

