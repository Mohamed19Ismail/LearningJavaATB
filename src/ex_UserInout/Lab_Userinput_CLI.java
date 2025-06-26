package ex_UserInout;

public class Lab_Userinput_CLI {
    public static void main(String[] args) {
        String age_str = args[0];
        int age = Integer.parseInt(age_str);
//    int age = 18;
    String yes = age >= 18 ? "Yes":"No";
        System.out.println(yes);
    }
}
