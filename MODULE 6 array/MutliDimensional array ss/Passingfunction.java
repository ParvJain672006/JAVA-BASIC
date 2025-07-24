import java.util.*;

public class Passingfunction {
     static void change(int[] arr) {
          arr[0] = 99;

     }

     public static void main(String args[]) {
          int[] nums = { 1, 2, 3, 4, 5, 6 };
          System.out.println(Arrays.toString(nums));
          change(nums);
          System.out.println(Arrays.toString(nums));
     }
}

// String are immutable in java
// array are mutable in java
// mutability their values can be modified at run time
