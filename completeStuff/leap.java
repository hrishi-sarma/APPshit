package completeStuff;

import java.util.Scanner;

public class leap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year: ");
        int n = scanner.nextInt();
        if (n % 4 == 0 && n % 100 != 0) {
            System.out.println("Leap year");
        }

        else if (n % 100 == 0) {
            if (n % 400 == 0) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not leap year");
            }
        }

        else {
            System.out.println("Not leap year");
        }

    }
}