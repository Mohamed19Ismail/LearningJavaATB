package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab148_SB {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Ismail");
        sb.append(1996);
        System.out.println(sb);
        sb.delete(6,9);
        System.out.println(sb);
        sb.replace(0,3,"java");
        System.out.println(sb);
    }
}
