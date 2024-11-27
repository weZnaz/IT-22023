import java.util.Scanner;

public class GeneralKnowledgeQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the General Knowledge Quiz!\n");
        int totalScore = 0;

         QuizQuestion[] quizQuestions = new QuizQuestion[]{
            new QuizQuestion("What is the capital city of Bangladesh?", "a. Dhaka  \nb. Chittagong  \nc. Rajshahi", 'a'),
            new QuizQuestion("Who is known as the Father of the Nation in Bangladesh?", "a. Sheikh Hasina  \nb. Sheikh Mujibur Rahman  \nc. Ziaur Rahman", 'b'),
            new QuizQuestion("What is the national flower of Bangladesh?", "a. Rose  \nb. Water Lily  \nc. Marigold", 'b'),
            new QuizQuestion("In which year did Bangladesh gain independence?", "a. 1947  \nb. 1971  \nc. 1991", 'b'),
            new QuizQuestion("What is the name of the longest river in Bangladesh?", "a. Jamuna  \nb. Padma  \nc. Meghna", 'a'),
        };


        for (int i = 0; i < quizQuestions.length; i++) {
            System.out.println((i + 1) + ". " + quizQuestions[i].questionText);
            System.out.println(quizQuestions[i].answerOptions + "\n");
            String userInput = scanner.nextLine();
            char userAnswer = userInput.toLowerCase().charAt(0);

            if (quizQuestions[i].correctAnswer == userAnswer) {
                System.out.println("Your answer is correct!\n");
                totalScore++;
            } else {
                System.out.println("Your answer is wrong! The correct answer is: " + quizQuestions[i].correctAnswer + "\n");
            }
        }

        System.out.println("Your final score is: " + totalScore + "/" + quizQuestions.length);
    }
}

class QuizQuestion {
    String questionText;
    String answerOptions;
    char correctAnswer;

    QuizQuestion(String questionText, String answerOptions, char correctAnswer) {
        this.questionText = questionText;
        this.answerOptions = answerOptions;
        this.correctAnswer = correctAnswer;
    }
}
