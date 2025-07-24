import java.util.*;


public class INSErttPRatice {
    public static void main ( String args[]){
        Scanner Sc = new Scanner(System.in);

        // array of object ;

        String [] str = new String [4];
        for(int i = 0 ; i<str.length ; i++){
            str[i] = Sc.next();
        }
        System.out.println( Arrays.toString(str));

        // after modifing the array ;
         str[1] = "ok";
         System.out.println( Arrays.toString(str));
         
            
        }
}

