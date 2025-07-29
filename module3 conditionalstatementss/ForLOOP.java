public class ForLOOP {
    public static void main(String[] args) {
        String[] animals = {"Lion", "Tiger", "Elephant", "Giraffe", "Zebra", "Monkey"};
        for (int i = 0; i < animals.length; i++) {
            System.out.println("Animal #" + (i + 1) + ": " + animals[i]);
        }

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10 is: " + sum);

        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
};
