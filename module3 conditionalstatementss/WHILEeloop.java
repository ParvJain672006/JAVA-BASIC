import java.util.Scanner;
public class WHILEeloop {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Let's find all even numbers of your choice .");

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        if (start > end) {
            System.out.println(" The starting number should be less than or equal to the ending number.");
        } else {
    


            if (start % 2 != 0) {
                start++;
            }
            System.out.println("Even numbers :");
            while (start <= end) {
                System.out.println(start);
                start += 2;
            }
        }
        System.out.println("Thank you for using me ");
    }
}
    

