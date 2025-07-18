package ex_13_Functions;

public class Lab131_User_Defined_one {
    public static void main(String[] args) {

        int result = sum_of_2(2,3);
        System.out.println(result);
        sum_of_no_return(3,4);
    }

    static int sum_of_2(int a, int b){
         return a+b;
    }

    static void sum_of_no_return(int a, int b){
        System.out.println(a+b);
    }
}
