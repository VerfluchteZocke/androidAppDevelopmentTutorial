import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Welcome message
        System.out.println("Welcome to 'Guess the number'! First, tell me what your name is:");
        //Get username, greet user, ask him if he wants to start the game
        Scanner scannerVariable = new Scanner(System.in);
        String name = scannerVariable.nextLine();
        System.out.println("Hello " + name);
        System.out.println(name + " Press 1 if we should start the game. If not, press 0.");
        int quit = scannerVariable.nextInt();
        //User wants to play the game
        if (quit==1) {

            //generate random int number
            Random rand = new Random();
            int int_random = rand.nextInt(1, 101);

            //User can guess 5 times
            for (int i = 0; i < 5; i++) {
                System.out.println("Guess a number between 1 and 100:");
                int guess = scannerVariable.nextInt();
                if (guess == int_random) {
                    System.out.println("Congrats! Your guess was correct!");
                    return;
                } else if (guess <= int_random)
                    System.out.println("Guess again! The number to guess is bigger than your guess.");
                else
                    System.out.println("Guess again! The number to guess is smaller than your guess.");
            }
            System.out.println("Game over! The number to guess was " + int_random);
            return;
        }
    }
}
