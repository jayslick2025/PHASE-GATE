
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class SubtractionQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        

        int score = 0;
        final int MAX_QUESTIONS = 10;

        System.out.println("Welcome to the Subtraction Quiz!) long startTime = System.currentTimeMillis();

        for (int i = 1; i <= MAX_QUESTIONS; i++) {
            int a, b;
            String key;

            