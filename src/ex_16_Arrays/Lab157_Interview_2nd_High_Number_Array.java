package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_2nd_High_Number_Array {
    public static void main(String[] args) {
        // Find the second largest number
        //int[] number = new int[3];

        int[] number = {12,33,24,50,23};
        int temp;

//        Arrays.sort(number1);
//        System.out.println(number1[number1.length - 2]);


        for(int i = 0;i<number.length;i++){
            for (int j =i+1; j<number.length; j++ ){
                if(number[i] > number[j]){
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }

            }
        }
        System.out.println( "The 2nd largest number is " + number[number.length-2]);
        System.out.println( "The 1st largest number is " + number[number.length-1]);
    }
}
