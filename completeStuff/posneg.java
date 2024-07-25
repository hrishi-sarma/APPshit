package completeStuff;

import java.util.Scanner;

public class posneg {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num: ");
        int n = scanner.nextInt();
        if (n > 0) {
            System.out.println("The number is positive");
        } else if (n < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
