package ex_11_While;

import java.util.Scanner;

public class Lab117_Factorial {
    public static void main(String[] args) {
         //Factorial
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program\n Enter the Number!");
        int number = scanner.nextInt();

        if(number<0){
            System.out.println("Negative is not allowed");
        }

        int factorial = 1;
        if(number <=0){
            System.out.println(factorial);
        }else{
            for(int i = 1;i<=number;i++){
                factorial = factorial * i;
            }
        }
        System.out.println("Factorial is ->" + factorial);
    }
}
