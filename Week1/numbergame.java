package Week1;

import java.util.Scanner;
import java.lang.Math;

public class numbergame {

    public static void main(String[] args) {

        int tries = 7;
        int placeholder = tries;
        String userGuess = "";
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int randomNumber = (int)(Math.random() * range) + min;

        Scanner myObj = new Scanner(System.in);

        for (int i = 0; i < placeholder; i++) {
        
            System.out.println("Guess a number between " + min + "-" + max + ", tries left: " + (tries));
            userGuess = myObj.nextLine();
            int userGuessConverted = Integer.parseInt(userGuess);

            if (userGuessConverted == randomNumber) {
                break;
            }
            tries = tries - 1;
        }

        if (tries > 0)
        {
            System.out.println("success, it was " + randomNumber);
            }
        else
            System.out.println("Sorry you ran out of guesses, the number was " + randomNumber);

        myObj.close();


    }
}
