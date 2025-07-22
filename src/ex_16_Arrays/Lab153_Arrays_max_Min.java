package ex_16_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab153_Arrays_max_Min {
    public static void main(String[] args) {
        int[] arr = {25,14,56,15,36,56,77,18,29,49};

//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-1]);

       int OutPut_max = give_max_Number(arr);
       int OutPut_min = give_min_Number(arr);

        System.out.println(OutPut_max);
        System.out.println(OutPut_min);
    }

    static int give_max_Number(int[] arr){
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] >  max){
                max = arr[i];
            }
        }
        return max;
    }

    static int give_min_Number(int[] arr){

        int min = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }


}
