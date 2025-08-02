public class ARRAY2D {
    public static void main(String[] args) {
        String[][] board = {
            {"🍎", "🍌", "🍇"},
            {"🍉", "🍒", "🍍"},
            {"🥝", "🍑", "🍓"}
        };

        System.out.println("Welcome to the Fruit Board!");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Diagonal fruits:");
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i][i] + " ");
        }
        System.out.println();

        System.out.println("All fruits in reverse order:");
        for (int i = board.length - 1; i >= 0; i--) {
            for (int j = board[i].length - 1; j >= 0; j--) {
                System.out.print(board[i][j] + " ");
            }
        }
        System.out.println();
    }
}
