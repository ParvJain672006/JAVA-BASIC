public class AVGSumMAX {
    public static void main(String[] args) {
        int[] scores = {85, 92, 76, 81, 95, 67, 88, 90, 73, 99, 100, 54, 78, 82, 91};
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        int aboveAvgCount = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }

        double avg = (double) sum / scores.length;
        System.out.println("Scores:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        System.out.println("Sum of scores: " + sum);
        System.out.println("Average score: " + avg);
        System.out.println("Maximum score: " + max);
        System.out.println("Minimum score: " + min);

        System.out.print("Scores above average: ");
        for (int score : scores) {
            if (score > avg) {
                System.out.print(score + " ");
                aboveAvgCount++;
            }
        }
        System.out.println();
        System.out.println("Number of scores above average: " + aboveAvgCount);

        System.out.print("Scores sorted in ascending order: ");
        int[] sortedScores = scores.clone();
        for (int i = 0; i < sortedScores.length - 1; i++) {
            for (int j = i + 1; j < sortedScores.length; j++) {
                if (sortedScores[i] > sortedScores[j]) {
                    int temp = sortedScores[i];
                    sortedScores[i] = sortedScores[j];
                    sortedScores[j] = temp;
                }
            }
        }
        for (int score : sortedScores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
}
