import java.util.*;

public class Seven {
    public static void main ( String args[]){
        // string method in java 
        String name = " john doe ";
         System.out.println(Arrays.toString(name.toCharArray()));

         // String method 2 ;
          System.out.println("Length :" + name.length());

          //string method 3 ;

          System.out.println("uppercase: " + name.toUpperCase());
          System.out.println("lowercase: " + name.toLowerCase());

          //method 4 
          System.out.println("index of y :" + name.indexOf("y"));

          // method 5 

          System.out.println("replace o with 'a': " + name.replace('o', 'a'));

          //method 6 

          System.out.println("Substring (1,3) : " + name.substring(1,3));

    }
    
}
