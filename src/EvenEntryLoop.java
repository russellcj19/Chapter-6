import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {
        int userEntry = 0;
        String result;
        System.out.println("Welcome to my game.\n");
        System.out.println("Its called Even Entry Loop.\n");
        while (userEntry != 999){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a even number >>>\n");
            userEntry = input.nextInt();

            if (userEntry % 2 == 0) {
                result = userEntry + " Good job the number is Even";

            } else
                result = userEntry + " ERRRORRRRRR it is not even";

            System.out.println(result);
        }
    }
}

