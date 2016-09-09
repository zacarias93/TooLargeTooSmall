package lee.zac.TooLargeTooSmall;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by zaclee on 9/9/16.
 */
public class TooLargeTooSmall {


    public String compareGuess(int userAnswer, int secretNumber) {

        if(userAnswer == secretNumber) {
            return("Your answer " + userAnswer + " is correct!");
        }
        else if(userAnswer > secretNumber) {
            return("Your answer is too large!");
        }
        else {
            return("Your answer is too low!");
        }
    }

    public Boolean isAnswerDiffThanLastAnswer(int userAnswer,int lastAnswer) {
        if (userAnswer == lastAnswer) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        TooLargeTooSmall tooLargeTooSmall = new TooLargeTooSmall();
        Random rand = new Random();
        int secretNumber = rand.nextInt(100)+1;

        Scanner in = new Scanner(System.in);
        int userAnswer = 0;
        int lastAnswer = 0;
        int numOfGuesses = 0;

        while(userAnswer != secretNumber){
            System.out.println("Guess the secret number between 1-100: ");
            userAnswer = in.nextInt();

            if(tooLargeTooSmall.isAnswerDiffThanLastAnswer(userAnswer, lastAnswer)) {
                numOfGuesses++;
                System.out.println(tooLargeTooSmall.compareGuess(userAnswer, secretNumber));
            }
            else {
                System.out.println("Please use a different number.");
            }
            lastAnswer = userAnswer;
        }
        
        System.out.println("Your answer: " + userAnswer + " is correct!");
        System.out.println("It took you " + numOfGuesses + " number of guesses.");
    }
}
