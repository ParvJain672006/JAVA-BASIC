
public class SELF1 {
    public static void main(String args[]) {
        int sumInt = add(10, 5);
        double sumDouble = add(3.5, 3.3);
        boolean isPos = isPositive(8);
        
        printResult("Integer Sum", sumInt);
        printResult("Double Sum", sumDouble);
        
        if (isPos) {
            System.out.println("8 is positive");
        } else {
            System.out.println("8 is negative");
        }
    }

    // Method for adding two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method for adding two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to check if a number is positive
    public static boolean isPositive(int a) {
        return a > 0;
    }

    // Method to print the result
    public static void printResult(String message, double result) {
        System.out.println(message + ": " + result);
    }
}

