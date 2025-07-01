package ex_12_Do_While;

import java.util.Scanner;

public class Lab128_Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");

        char ch = scanner.next().toLowerCase().charAt(0);
        if(ch == 'a' || ch =='i' || ch=='e'|| ch=='o'|| ch=='u'){
            System.out.println(ch + " is vowel");
        }else if(ch>='a'&& ch <='z'){
            System.out.println(ch+ " is consonent");
        }else{
            System.out.println("Invalid char");
        }
    }
}
