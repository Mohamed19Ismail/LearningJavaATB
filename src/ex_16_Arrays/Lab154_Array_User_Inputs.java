package ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array(int) only");

        int size = sc.nextInt();

        int[] marks = new int[size];

        for(int i = 0;i<marks.length;i++){
            System.out.println("Enter the number for " + i + " position");
            marks[i] = sc.nextInt();
        }
        System.out.println("Displaying the marks");

        for (int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }


    }
}
