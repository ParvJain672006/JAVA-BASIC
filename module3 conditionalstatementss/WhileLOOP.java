
import java.io.*;

public class WhileLOOP {
    public static void main ( String args []){
    
        Console can= System.console();
        int count ;
        count = Integer.parseInt(can.readLine());


        
       
        

         
        System.out.println("using while loop :");
        while (count <= 5){
            System.out.println("count = " + count);
            count++;
        }
        System.out.println("using for dowhile loop :");
        count = 1 ;
        do{
            System.out.println("count = " + count);
            count ++ ;

        }while ( count <=5);


            
    }
    
};

