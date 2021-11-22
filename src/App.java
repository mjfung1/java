import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("welcome to the java game");

        // start the game with guessing a number. demo of variable and while loop.

        Random rand = new Random();
        int theSecretNumber = rand.nextInt(10);
        // System.out.println(theSecretNumber);
        int yourGuess = 0;

        Scanner scan = new Scanner(System.in);

        while (theSecretNumber != yourGuess) {
            System.out.println("Guess a number my dude or dudette");
            yourGuess = scan.nextInt();

            if (yourGuess < theSecretNumber) {
                System.out.println("too low, try bigger number");
            }
            if (yourGuess > theSecretNumber) {
                System.out.println("too high, try smaller number");
            }
        }

        // if exit while loop, we have a match

        System.out.println("You got it boi");
    }
}
