package ex_UserInout;

import java.util.Scanner;

public class Lab_UserInput_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");

        int age = scanner.nextInt();
        String yes = age >= 18 ? "Yes":"No";
        System.out.println(yes);
    }
}
