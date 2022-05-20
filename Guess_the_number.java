package Projects;
import java.util.Scanner;
import java.util.Random;
public class Guess_the_number {
    public static void main(String[] args){

        System.out.print("Hello! What is your name?");
        Scanner keyboard = new Scanner(System.in);
        String name=keyboard.next();
        System.out.print("\nWell,"+name+", I am thinking of a number between 1 and 20. \nTake a guess");

        Random generator=new Random();
        int random =generator.nextInt(20)+1;
        boolean correct =false;

        int attempts=1;
        boolean playing =true;
        while(playing) {

            while (!correct) {
                int guess = keyboard.nextInt();
                if (guess > random) {
                    System.out.println("Your Guess is too High. \n Take a guess");
                    attempts += 1;
                } else if (guess < random) {
                    System.out.print("Your Guess is too low.\n Take a Guess.");
                    attempts += 1;
                } else {
                    System.out.print("Good Job," + name + " You guessed my number in " + attempts + " guess!");
                    correct = true;

                }
            }
        }
        System.out.print("Good Job," + name + " You guessed my number in " + attempts + " guess!");
        System.out.println("Would you like to play again?(y or n)");
        String answer = keyboard.next();
        playing=answer.equalsIgnoreCase("y");
        attempts=1;
        random =generator.nextInt(20)+1;


    }

}


