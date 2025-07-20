package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringbuffer = new StringBuffer("Mohamed ");
        stringbuffer.append("Ismail");
        System.out.println(stringbuffer);

        System.out.println(stringbuffer.reverse());

        String s1= "hello";
        String s2 = "World";
        String s3 = s1+s2;

        System.out.println(s3);

    }
}
