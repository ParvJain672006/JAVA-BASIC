import java.io.*;
import java.util.Scanner;

public class WhileDoLoopDemo {
    public static void main(String args[]) {
        int start, end;

        Console can = System.console();
        if (can != null) {
            start = Integer.parseInt(can.readLine("Enter starting count: "));
            end = Integer.parseInt(can.readLine("Enter ending count: "));
        } else {
        
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter starting count: ");
            start = sc.nextInt();
            System.out.print("Enter ending count: ");
            end = sc.nextInt();
        }

        System.out.println("\nUsing while loop:");
        int count = start;
        while (count <= end) {
            System.out.println("count = " + count);
            count++;
        }

        System.out.println("\n Using do-while loop:");
        count = start;
        if (start <= end) {
            do {
                System.out.println("count = " + count);
                count++;
            } while (count <= end);
        } else {
            System.out.println("Start value is greater than end value. Loop not executed.");
        }
    }
}

