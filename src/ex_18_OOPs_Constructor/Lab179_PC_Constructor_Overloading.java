package ex_18_OOPs_Constructor;

public class Lab179_PC_Constructor_Overloading {
    public static void main(String[] args) {

        Person1 p1 = new Person1("Ismail",1234567,"bangalore");

        Person1 p2 = new Person1();
        p2.name = "Adam";

        System.out.println(p2.name);
        System.out.println(p2.phone);
    }
}

class Person1{

    String name;
    long phone;
    String address;

    Person1(){
        System.out.println("Default Constructor");
    }

    Person1(String name_user, long user_phone, String user_address){
        this.name = name_user;
        this.phone = user_phone;
        this.address = user_address;
    }

}

