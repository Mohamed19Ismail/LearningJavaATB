package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1");


       int a = 0;

        if(scanner.hasNextInt()){
            a = scanner.nextInt();
        }else{
            System.out.println("Enter the int only");
            System.exit(0);
        }
        System.out.println("Enter the number 2");

        int b = 0;

        if(scanner.hasNextInt()){
            b =  scanner.nextInt();
        }else {
            System.out.println("Enter the int only");
            System.exit(0);
        }

        int result = sum(a,b);
        System.out.println("The sum of two number " + result);

        int result_sub = sub(a,b);
        System.out.println("The subtract of two number "+ result_sub);

        int result_div = div(a,b);
        System.out.println("The division of two number " + result_div);

        int result_mul = mul(a,b);
        System.out.println("The multi fo two number "+ result_mul);

    }

    static int sum(int a,int b){
        return a+b;
    }

    static int sub(int a,int b){
        return a-b;
    }

    static int div(int a,int b){
        if(b==0){
            System.out.println("b cant be zero");
            System.exit(0);
        }
        return a/b;

    }

    static int mul(int a, int b){
        return a*b;

    }
}
