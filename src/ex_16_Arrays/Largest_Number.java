package ex_16_Arrays;

public class Largest_Number {
    public static void main(String[] args) {

        int[] numbers = {23,45,111,34,26,200};

        int largest = numbers[0];

        for (int i=0; i<numbers.length; i++){


            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        System.out.println(largest);
    }
}
