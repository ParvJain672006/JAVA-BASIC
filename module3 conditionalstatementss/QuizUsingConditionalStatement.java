public class QuizUsingConditionalStatement {
    public static void main(String[] args) {
        int score = 0;
        int[] answer = {4, 6, 8, 10, 25};
        String[] questions = {
            "What is 2 + 2?",
            "What is 3 + 3?",
            "What is 4 + 4?",
            "What is 5 * 2?",
            "What is 5 squared?"
        };

        System.out.println("===== Quiz Game =====");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            int userAnswer = i + 4;  // Simulated user input
            System.out.println("You answered: " + userAnswer);

            if (userAnswer == -1) {
                System.out.println("Quiz ended.");
                break;
            }

            if (userAnswer == answer[i]) {
                score += 10;
                System.out.println("Correct answer!");
            } else {
                System.out.println("Wrong answer.");
            }
        }

        System.out.println("Your score is: " + score);
    }
}



