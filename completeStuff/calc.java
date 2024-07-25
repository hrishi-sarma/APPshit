package completeStuff;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 for addition or 2 for subtraction.");
        int n = scanner.nextInt();
        scanner.nextLine();
        if (n == 1) {
            System.out.println("Enter num1: ");
            int a = scanner.nextInt();
            System.out.println("Enter num2: ");
            int b = scanner.nextInt();
            int c = a + b;
            System.out.println("Sum is: " + c);
        }

        else if (n == 2) {
            System.out.println("Enter num1: ");
            int a = scanner.nextInt();
            System.out.println("Enter num2: ");
            int b = scanner.nextInt();
            int c = a - b;
            System.out.println("Sum is: " + c);
        }

    }
}
