package ex_15_StringBuffer_Builder_StringFunctions;

public class Interview_Vowels {
    public static void main(String[] args) {
        //Java program to count Vowels and consonants
        // a,i,e,o,u;

        String input = "Java Program to Count Vowels and Consonants";
        int vowel = 0;
        int consonants = 0;

        input = input.toLowerCase();
        System.out.println(input);
        int length = input.length();

        for(int i=0; i < length;i++){
            char ch = input.charAt(i);
            if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'){
                vowel++;
            }else{
                consonants++;
            }
        }
        System.out.println("The Vowels in the given String is = " + vowel);
        System.out.println("The consonants in the given String is = " + consonants);
    }


}
