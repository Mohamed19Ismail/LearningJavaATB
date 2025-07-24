package ex_16_Arrays;

import java.util.Scanner;

public class Lab163_2D_Right_trinagle {
    public static void main(String[] args) {

        int[][] num = new int[3][3];


        System.out.println("Enter the size of martrix");
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
        for(int i =0; i< n;i++){
            for(int j = 0; j <= i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =1; i<= n;i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            } for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
//
        }

    }
}
