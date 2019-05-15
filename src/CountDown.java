public class CountDown {

    public static void main(String[] args) {
        System.out.println("FINAL COUNTDOWN!");
        System.out.println("Here is my Do While loop >>>");
        displayDoWhile();
        System.out.println("Here is my For loop >>>");
        displayForLoop();
        System.out.println("Here is my down from 10 loop >>>");
        downfrom10();
        System.out.println("Finally here is my up to 10 loop >>>");
        upTo10();

    }

    public static void upTo10() {
        int count = 0;
        while (count <= 10) {
            System.out.println(count);
            ++count;

        }
    }

    public static void displayDoWhile() {
        int count = 10;
        int count2 = 1;
        do {
            System.out.println(count);
            --count;
        } while (count >= 0);
        do {
            System.out.println(count2);
            ++count2;
        } while (count2 <= 10);
    }

    public static void displayForLoop() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        for (int j = 9; j >= 0; j--) {
            System.out.println(j);
        }
    }

    public static void downfrom10() {
        int count = 10;
        while (count != 0) {

            System.out.println(count);
            --count;
        }
    }
}
