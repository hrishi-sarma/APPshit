package completeStuff;

import java.util.Scanner;

public class vending {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 1 for juice or 2 for soda.");
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("Dispensing juice.");
        } else if (n == 2) {
            System.out.println("Dispensing soda.");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
