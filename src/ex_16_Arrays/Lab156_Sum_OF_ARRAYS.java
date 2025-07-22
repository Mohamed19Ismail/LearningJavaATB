package ex_16_Arrays;

public class Lab156_Sum_OF_ARRAYS {
    public static void main(String[] args) {
        int[] numbers = {10,20,30};

        int sum = 0; // 10+20+30 = 60

        for (int i=0; i<numbers.length; i++){
           sum = numbers[i]+sum;
            System.out.println(sum + " + ");
        }
        System.out.println("The sum of an Array is = " + sum);

    }
}
