package ex_15_StringBuffer_Builder_StringFunctions;

public class IMPT_StringBuffer_Functions {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        sb.insert(5,"java");
        sb.reverse();
        System.out.println(sb);
    }



}
