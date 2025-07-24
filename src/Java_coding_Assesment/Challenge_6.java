package Java_coding_Assesment;

import java.util.Scanner;

public class Challenge_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        if(number > 0){
            System.out.println(number + " is Positive");
        } else if (number < 0 ) {
            System.out.println(number + " is Negative");
        }else if(number == 0){
            System.out.println(number + " is Zero");
        }
    }
}
