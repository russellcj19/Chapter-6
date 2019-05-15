import java.util.Scanner;

public class RandomGuess3 {
    public static void main(String[] args) {
        int userGuess = 0;
        int count = 0;
        int tohighcount = 0;
        int tolowcount = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my game/n.");
        System.out.println("Pick a number between 1 and 10\n");
        System.out.println("Guess correctly and win a prize.\n");


        int random = (int) (Math.random() * 10 + 1);

        while (userGuess != random) {
            System.out.print("Pick a number ");
            userGuess = input.nextInt();
            if (userGuess < 0 || userGuess > 10) {
                System.out.println("That number was outside of 1 - 10");
            } else if (userGuess == random) {
                System.out.println("You Guess Correctly!!");
            } else if (userGuess > random) {
                System.out.println("Wrong number it was to high");
                tohighcount++;
            } else {
                System.out.println("Wrong number it was to low");
                tolowcount++;

                count = count + 1;
            }}

            System.out.println("Thanks for playing!! Check out your Stats Below ");
            System.out.println("You guessed too high " + tohighcount + " times." + "\nYou guessed too low " + tolowcount +
                    " times." + "\nIt took you  " + count + " trys");

            System.out.println("*******************Display Graph************************");
            System.out.print("H >> ");
            displayBar(tohighcount);
            System.out.print("L >> ");
            displayBar(tolowcount);
            System.out.print("T >> ");
            displayBar(count);

        }

        public static void displayBar (int b){
            for (int i = 0; i < b; ++i) {
                System.out.print("#");
            }
            System.out.println();

        }
    }
