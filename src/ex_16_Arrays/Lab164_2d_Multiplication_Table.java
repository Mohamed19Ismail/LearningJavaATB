package ex_16_Arrays;

import java.util.Scanner;

public class Lab164_2d_Multiplication_Table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int sizeOFTable  = sc.nextInt();

        for (int i = 0; i<sizeOFTable;i++){
            for (int j = 0; j<sizeOFTable;j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }


    }
}
