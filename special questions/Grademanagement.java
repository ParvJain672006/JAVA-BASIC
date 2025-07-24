public class Grademanagement {
    public static void main(String[] args) {
        String[] names = {"alice", "boba"};
        double[] grades = {22.2, 33.2};
        int[][] tests = {{80, 90}, {95, 84}};
        System.out.println("-------------grade manager--------------------");
        for (int i = 0; i < names.length; i++) {
            double avg = calculateAvg(tests[i]);
            String report = generatereport(names[i], grades[i]);
            System.out.println(report);
            System.out.println("test avg: " + avg);
        }
    }

    public static double calculateAvg(int[] scores) {
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public static String generatereport(String name, double grade) {
        return   name  + grade;
    }
}

