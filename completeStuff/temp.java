package completeStuff;

import java.util.Scanner;

public class temp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature: ");
        int n = scanner.nextInt();
        if (n > 30) {
            System.out.println("It's hot!");
        }

        else if (n <= 30 && n > 20) {
            System.out.println("It's warm.");
        }

        else if (n <= 30 && n > 20) {
            System.out.println("It cool.");
        }

        else {
            System.out.println("It's cold.");
        }
    }
}
