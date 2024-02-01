import java.util.Random;
import java.util.Scanner;


class Task1{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String play="yes";

        while(play.equals("yes"))
        {
            Random rand =new Random();
            int randNum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;

            while (guess != randNum) {
                System.out.println("Guess a number between 1 and 100:");
                guess = reader.nextInt();
                tries++;

                if (guess == randNum) {
                    System.out.println("Awesome you guessed it right!!");  
                    System.out.println("It only took you " +" "+ tries +""+" guesses!");
                    System.out.println("Would you like to play again? yess or no:");
                    play = reader.next().toLowerCase();
                }
                else if(guess>randNum){
                    System.out.println("Your guess is too high! Try lower.");

                }
                else if(guess<randNum){
                    System.out.println("Your guess is too low! Try higher.");
            }
        }
    }
    reader.close();
    }
}
