import java.util.ArrayList;
import java.util.Scanner;

public class Question {
    String questionText;
    String[] options;
    int correctOptionIndex;

    public Question(String questionText, String[] options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean isCorrect(int userChoice) {
        return userChoice == correctOptionIndex + 1;
    }
}

public class QuizGame {
    public static void main(String[] args) {
        ArrayList<Question> quiz = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Add 10 questions
        quiz.add(new Question("What is the capital of France?",
                new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 2));
        quiz.add(new Question("Which planet is known as the Red Planet?",
                new String[]{"Earth", "Mars", "Jupiter", "Venus"}, 1));
        quiz.add(new Question("Who wrote 'Romeo and Juliet'?",
                new String[]{"Charles Dickens", "William Shakespeare", "Mark Twain", "Jane Austen"}, 1));
        quiz.add(new Question("What is the largest mammal?",
                new String[]{"Elephant", "Blue Whale", "Giraffe", "Hippopotamus"}, 1));
        quiz.add(new Question("Which element has the chemical symbol 'O'?",
                new String[]{"Gold", "Oxygen", "Silver", "Iron"}, 1));
        quiz.add(new Question("What is the square root of 64?",
                new String[]{"6", "7", "8", "9"}, 2));
        quiz.add(new Question("Which continent is the Sahara Desert located in?",
                new String[]{"Asia", "Africa", "Australia", "Europe"}, 1));
        quiz.add(new Question("Who painted the Mona Lisa?",
                new String[]{"Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Claude Monet"}, 2));
        quiz.add(new Question("What is the boiling point of water in Celsius?",
                new String[]{"90", "100", "110", "120"}, 1));
        quiz.add(new Question("Which language is primarily spoken in Brazil?",
                new String[]{"Spanish", "Portuguese", "French", "English"}, 1));

        int score = 0;

        for (int i = 0; i < quiz.size(); i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            Question q = quiz.get(i);
            q.displayQuestion();

            System.out.print("Your answer (1-4): ");
            int userAnswer = scanner.nextInt();

            if (q.isCorrect(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + q.options[q.correctOptionIndex]);
            }
        }

        System.out.println("\n Quiz Over! Your score: " + score + "/" + quiz.size());
        scanner.close();

    }
}