package ex_14_String;

import java.util.Scanner;

public class InterviewCoding_Question {
    public static void main(String[] args) {
        //Palindrome
        //madam -> reverse madam == madam

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.next();
        //String reversestr = reverseStringSB(input);
        //System.out.println(reversestr);

        String reversedstr = reverseStr(input);

        if(reversedstr.equalsIgnoreCase(input)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

//        StringBuffer str = new StringBuffer(scanner.next());
//        String reverse = String.valueOf(str.reverse());
//        System.out.println(reverse);


        //System.out.println(str);
    }
    static String reverseStr(String input){
        String reversedString = "";
        for(int i=input.length()-1;i>=0;i--){
            reversedString = reversedString + input.charAt(i);
        }
        return reversedString;
    }
//    static String reverseStringSB(String input){
//        StringBuilder sb = new StringBuilder(input);
//        return sb.reverse().toString();
//    }
}
