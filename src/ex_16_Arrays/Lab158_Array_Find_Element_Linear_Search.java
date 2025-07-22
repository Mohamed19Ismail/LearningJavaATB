package ex_16_Arrays;

public class Lab158_Array_Find_Element_Linear_Search {
    public static void main(String[] args) {
        int[] number ={23,43,45,67,87,90};


        for(int i=0;i<number.length;i++){
            if(number[i]==67){
                System.out.println("The Index is " + i);
            }
        }
//        for(int num:number){
//            if(num == 67){
//                System.out.println("The index is " + number[num]);
//            }
//        }
    }
}
