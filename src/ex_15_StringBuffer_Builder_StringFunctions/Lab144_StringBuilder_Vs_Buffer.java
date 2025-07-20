package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        String s0 = "Ismail";
        String s1 = new String("Ismail");

        StringBuffer stringbuffer = new StringBuffer("Isnail");
        StringBuilder stringbuilder = new StringBuilder("Ismail");

        System.out.println(s1);
        System.out.println(s0);
        System.out.println(stringbuffer);
        System.out.println(stringbuilder);


    }
}
