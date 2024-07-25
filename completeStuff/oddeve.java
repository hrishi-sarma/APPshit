package completeStuff;

import java.util.Scanner;

public class oddeve {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even num");
        } else {
            System.out.println("Odd num");
        }

    }
}