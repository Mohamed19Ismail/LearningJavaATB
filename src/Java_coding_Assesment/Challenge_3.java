package Java_coding_Assesment;
import java.util.Scanner;

public class Challenge_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer (b): ");
        int b = scanner.nextInt();

        // Comparison Operators
        System.out.println("--- Comparison Operators ---");
        System.out.println("a == b: " + (a == b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));


        System.out.println("\n--- Logical Operators ---");
        boolean condition1 = (a > b);
        boolean condition2 = (a > 0);
        boolean condition3 = (a < b);


        System.out.println("(a > b) && (a > 0): " + (condition1 && condition2));


        System.out.println("(a < b) || (a > 0): " + (condition3 || condition2));


        System.out.println("!(a > b): " + (!condition1));

    }
}
