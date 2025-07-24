package collectionframework;
import java.util.*;
public class SEtDemo {
    public static void main ( String args[]){
        HashSet<Integer>numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("contains 20 ?"  +  numbers.contains(20));
        for(Integer num : numbers ) {
            System.out.println("number :"  + num );

        }
        numbers.remove(10);
        System.out.println(" size after  removal " + numbers.size());

    }
    
}
