package ex_UserInout;

import java.util.Scanner;

public class Lab_UserInput_Scanner01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ENter your name");
        String name = scanner.next();
        String loname = name.toLowerCase();
        System.out.println(loname);

    }
}
