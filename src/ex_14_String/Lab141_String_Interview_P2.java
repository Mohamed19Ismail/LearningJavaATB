package ex_14_String;

public class Lab141_String_Interview_P2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2="Hello";


        String o1 = new String("hello");
        String o2 = new String("Hello");
        String o3 = new String("hello");

        System.out.println(s1 == o3); // == -> Comparision this refer to location reference
        System.out.println(s1 == o1);
        System.out.println(o1 == o3);
        System.out.println(s1 == s2);

        //equals(content) -> value

        System.out.println(s1.equals(s2));
        System.out.println(o1.equals(o2));
        System.out.println(o1.equalsIgnoreCase(o2));
        System.out.println(s1.equals(o2));

        // == check for the ref
        // = assign the value
    }
}
