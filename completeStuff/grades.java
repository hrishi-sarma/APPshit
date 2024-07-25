package completeStuff;

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks: ");
        int n = scanner.nextInt();
        if (n >= 90 && n <= 100) {
            System.out.println("A");
        }

        else if (n < 90 && n >= 80) {
            System.out.println("B");
        }

        else if (n < 80 && n >= 70) {
            System.out.println("C");
        }

        else if (n < 70 && n >= 60) {
            System.out.println("D");
        }

        else if (n < 60 && n >= 0) {
            System.out.println("F");
        }

        else {
            System.out.println("Invalid marks");
        }
    }
}
