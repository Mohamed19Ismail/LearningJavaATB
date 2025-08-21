package ex_18_OOPs_Constructor;

public class Lab178_PC_Real {
    public static void main(String[] args) {
        Person p1 = new Person("Ismail",1234567,"bangalore");
        Person p2 = new Person("adam",1234567,"bangalore");
    }

}

class Person{

    String name;
    long phone;
    String address;

    Person(){
        System.out.println("Default Constructor");
    }

    Person(String name_user, long user_phone, String user_address){
        this.name = name_user;
        this.phone = user_phone;
        this.address = user_address;
    }

}
