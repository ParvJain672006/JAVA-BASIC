

import java.io.*;

public class Cossole{
    public static void main(String[] args) {
        Console console = System.console();
        
        // Check if console is available (works only in command line)
        // if (console == null) {
        //     System.out.println("No console available. Run this program from the command line.");
        //     return;
        // }

        // String input
        String name = console.readLine("Enter your name: ");
        
        // Integer input
        int age = Integer.parseInt(console.readLine("Enter your age: "));
        
        // Float input
        float height = Float.parseFloat(console.readLine("Enter your height (in cm): "));
        
        // Double input
        double weight = Double.parseDouble(console.readLine("Enter your weight (in kg): "));
        
        // Display the entered information
        console.printf("\nName: %s\nAge: %d\nHeight: %.2f cm\nWeight: %.2f kg\n", name, age, height, weight);
    }
}
