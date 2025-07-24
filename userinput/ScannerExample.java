import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // String input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Integer input
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());
        
        // Float input
        System.out.print("Enter your height (in cm): ");
        float height = Float.parseFloat(scanner.nextLine());
        
        // Double input
        System.out.print("Enter your weight (in kg): ");
        double weight = Double.parseDouble(scanner.nextLine());
        
        // Display the entered information
        System.out.printf("\nName: %s\nAge: %d\nHeight: %.2f cm\nWeight: %.2f kg\n", name, age, height, weight);
        
        // Close the scanner to avoid resource leaks
        scanner.close();
    }
};



    

