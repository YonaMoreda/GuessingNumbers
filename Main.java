import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = 1 + random.nextInt(99);
        Scanner scanner = new Scanner(System.in);
        playGame(randomNumber, scanner);
    }

    private static void playGame(int randomNumber, Scanner scanner) {
        System.out.print("Guess a number between 1 and 100: ");
        int guessedNumber = scanner.nextInt();
        int guessedCount = 1;
        while(guessedNumber != randomNumber) {
            if(guessedNumber > randomNumber) {
                System.out.print("guessed too high. Try again: ");
            } else {
                System.out.print("guessed too low. Try again: ");
            }
            guessedNumber = scanner.nextInt();
            guessedCount++;
        }
        System.out.println("You guessed right after " + guessedCount + " guesses");
    }
}
