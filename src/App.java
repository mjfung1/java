import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
// git try
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("welcome to the java game");

        /*
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
        */

        // loops
        /*
        for (int i = 0; i < 9; i++) {
            System.out.print("the number is " + i + "', '");
        }

        System.out.println("========================");

        for (int i = 1; i < 40; i += 3) {
            System.out.print("the number is " + i + ", ");
        }
        */

        // arrays
        /*
        int [] luckyNumbers = {4, 6, 8, 12, 14, 53, 24};
        System.out.println(luckyNumbers[0]);

        // for (int i = 0; i < luckyNumbers.length; i++) {
        //     int num = luckyNumbers[i];

        //     System.out.println("the lucky number at position " + i + " is " + num);
        // }

        for (int number : luckyNumbers) {
            System.out.println("the lucky number is " + number);
        }
        */

        // arrayLists
        /*
        ArrayList <Integer> unluckyNumbers = new ArrayList<>();
        unluckyNumbers.add(7);
        unluckyNumbers.add(17);
        unluckyNumbers.add(47);
        unluckyNumbers.add(77);
        unluckyNumbers.add(79);

        for (int i = 0; i < unluckyNumbers.size(); i++) {
            System.out.println("the unlucky number at pos " + i + " is " + unluckyNumbers.get(i));
        }

        for (int num : unluckyNumbers) {
            System.out.println("the unlucky number is " + num);
        }

        */


        CaveMan c1 = new CaveMan("peter", 40, 300f);
        CaveMan c2 = new CaveMan();
        System.out.println(c1.getName());
        c2.setName("julio");
        System.out.println(c2.getName());


    }
}
