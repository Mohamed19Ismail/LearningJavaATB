package ex_06_Ternary_Operator;

public class Lab068_TO_Three_Max {
    public static void main(String[] args) {
        //Find the maximum btw the tree numbers

        //Step 1 : Find inputs and outputd
        //Inputs -->n1,n2,n3 = int
        //Outputs --> String --> max number
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        //Step 2 : Rough logic
        //n1 > n2 and n1 > n3 then n1 is largest
        //n2 > n3 and n2 > n1 then n2 is largest
        //n3 then n3 is largest

        //Step 3

        int max = (n1 > n2 ) ? (n1 > n3) ? n1  : n3 : (n2 > n3)  ? n2 : n3;
        System.out.println("Max is " + max );
    }
}
