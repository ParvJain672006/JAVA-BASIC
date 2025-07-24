// Write a program to initialize a 2x2 double array and print its elements using
// nested loops 


public class Three {
    public static void main(String args[]) {
        int arr[][] = {{4,5,6}, {7,8,9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
