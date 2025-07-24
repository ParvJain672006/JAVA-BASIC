package pratice;

// Write a program to create an int array of 5 elements, initialize it, and print the
// sum using a for loop

public class One {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int sum = 0;

        System.out.println("Elements in the array are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
            sum += arr[i];
        }
        System.out.println("\nSum of all elements: " + sum);
        System.out.println();
    }
}
