package BASICCC;
import java.util.*;

public class ONE {
    public static void main(String[] args) {
        System.out.println(56);
        System.out.println("hello world");
        System.out.println(Arrays.toString(new int[] {1, 2, 3, 4}));
        System.out.println(Arrays.toString(new int[] {1, 2, 3, 4}));
    }
}


//  1 . for exceuting every command in println > it is calling  the return ' integer.toString ' method '.
//  2. if it is null object , it will print null , otherwise print toString()
//  3. everytime i use println() or pass any object  to it > it calls the "value" > them with the conditional operator checs weather obj is null or not 
// 4. with Array.toString() > it is overriding default to string functions of java 