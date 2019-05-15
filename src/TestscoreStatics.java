import java.util.Scanner;

public class TestscoreStatics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int high = 90;
        int Advanced = 80;
        int Avg = 70;
        int belAvg = 60;
        int scoreEntered = 0;
        int totalAs = 0;
        int totalBs = 0;
        int totalCs = 0;
        int totalDs = 0;
        int totalFs = 0;
        int totalScoresEntred = 0;
        boolean quit = true;
        System.out.println("Hello and welcome to my Test Score Converter.");
        System.out.println("\nTo start just enter a student's score... " +
                "To exit and view the graph press 999 ");

        while (quit) {
            System.out.println("\nPlease enter Student Scores (999 to exit)");
            scoreEntered = input.nextInt();
            if(scoreEntered == 999){
                quit = false;
                --totalScoresEntred;
            }
            else if (scoreEntered >= high) {
                System.out.println("Test Grade = A! , This score is Excellent!  Keep it up");
                totalAs++;
            } else if (scoreEntered < high && scoreEntered >= Advanced) {
                System.out.println("Test Grade = B! , This score is Advanced!");
                totalBs++;
            } else if (scoreEntered < Advanced && scoreEntered >= Avg) {
                System.out.println("Test Grade = C. This score is Average.So close to a B!");
                totalCs++;
            } else if (scoreEntered < Avg && scoreEntered >= belAvg) {
                System.out.println("Test Grade = D..  This score is bellow Average.Reach for better ");
                totalDs++;
            } else if (scoreEntered < belAvg) {
                System.out.println("Test Grade = F... This score is horrible. YOU NEED TO STUDY! ");
                totalFs++;
            }
            totalScoresEntred++;

        }
        System.out.println("Thank You for using my Program! Check out the Scores below! ");
        System.out.println("As = " + totalAs + "\nBs = " + totalBs +
                "\nCs = " + totalCs + "\nDs = " + totalDs + "\nFs = " + totalFs +
                "\nYou entered " + totalScoresEntred + " Scores");

        System.out.println("*******************Display Graph************************");
        System.out.print("As "); displayBar(totalAs);
        System.out.print("Bs "); displayBar(totalBs);
        System.out.print("Cs "); displayBar(totalCs);
        System.out.print("Ds "); displayBar(totalDs);
        System.out.print("Fs "); displayBar(totalFs);
    }

    public static void displayBar(int b) {
        for (int i = 0; i < b; ++i) {
            System.out.print("#");
        }
        System.out.println();
    }
}