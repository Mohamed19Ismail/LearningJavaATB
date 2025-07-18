package ex_13_Functions;

public class Lab132_User_define_Part1 {
    public static void main(String[] args) {
    wp_wr_Greet();

    System.out.println(greet_with_hello_wop_wrt());

    wp_wort("Ismail","Bangalore",28);

    int sum = wp_wr(2,4,2);
    int sum1 = wp_wr(2,4,2);
    int sum2= wp_wr(2,4,2);
    int sum3 = wp_wr(2,4,2);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum);

    }
//1. Without Parameters and Without Return Type.
    static void wp_wr_Greet(){
        System.out.println("hi, How are you");
    }

//2. Without Parameters but With Return Type

    static String greet_with_hello_wop_wrt(){

        System.out.println("Hi");
        return "I am doing good";
    }

    //3. With Parameters and Without Return Type

    static void wp_wort(String name, String place, int age){
        System.out.println("Your name  :" +name+ "\nYour age is " + age + "\nPlace " + place);
    }

    //4. With Parameters and With Return Type.

    static int wp_wr(int a, int b,int c){
        return a+b+c;
    }

}
