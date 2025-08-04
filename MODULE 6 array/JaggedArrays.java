public class JaggedArrays {
    public static void main(String[] args) {
        int[][] marks = new int[3][];
        marks[0] = new int[] {85, 90, 78};
        marks[1] = new int[] {88, 76};
        marks[2] = new int[] {92, 81, 74, 69};

        System.out.println("Student Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        int highest = marks[0][0];
        int studentNum = 1;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] > highest) {
                    highest = marks[i][j];
                    studentNum = i + 1;
                }
            }
        }
        System.out.println("Highest mark is " + highest + " by Student " + studentNum);
    }
}
