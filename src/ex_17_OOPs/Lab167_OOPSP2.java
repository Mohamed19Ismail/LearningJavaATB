package ex_17_OOPs;

public class Lab167_OOPSP2 {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
//        s1.name = "Ismail";
//        System.out.println(s1.name);
    }

}

class Student {


//This is called as default constructor, same name as the class name.
    Student(){
        System.out.println("Default Constructor");
    }



    void sleep(){
        System.out.println("hi");
    }

}