package Java_coding_Assesment;

import java.util.Scanner;

public class Challenge_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number");
        int number_1 = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int number_2 = sc.nextInt();
        System.out.println("Enter the 3rd number");
        int number_3 = sc.nextInt();

        largestNumber(number_1,number_2,number_3);


    }

    static void largestNumber(int number_1, int number_2,int number_3){

        if(number_1 > number_2 && number_1 > number_3){
            System.out.println("The largest number is "  + number_1  );
        } else if (number_2 > number_3) {
            System.out.println("The largest number is " + number_2);
        }else {
            System.out.println("The largest number is " + number_3);
        }

    }

}
