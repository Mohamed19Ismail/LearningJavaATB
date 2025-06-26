package ex_If_Else_If;

import java.util.Scanner;

public class Lab_80_If {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 18){
            System.out.println("Vote");
        }else {
            System.out.println("Dont vote");
        }

    }
}
