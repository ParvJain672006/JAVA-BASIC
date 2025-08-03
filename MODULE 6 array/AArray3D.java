import java.util.Scanner;

public class AArray3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][][] cube = new String[2][2][2];

        System.out.println("Let's build a 2x2x2 cube of your favorite words!");
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    System.out.print("Enter a word for position [" + i + "][" + j + "][" + k + "]: ");
                    cube[i][j][k] = sc.nextLine();
                }
            }
        }

        System.out.println("\nHere's your word cube:");
        for (int i = 0; i < cube.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    System.out.print(cube[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
