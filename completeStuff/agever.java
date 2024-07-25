package completeStuff;

import java.util.Scanner;

public class agever {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int n = scanner.nextInt();
        if (n >= 18) {
            System.out.println("You're elligible to vote");
        } else {
            System.out.println("You're not elligible to vote");
        }

    }
}
