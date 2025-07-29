package ex_17_OOPs;

public class Person {

    //These are called as properties, attributes. instance variables, member variables
    String name;
    int age ;
    String height;
    String gender;
    boolean is_married;

    //There are called as Behaviours, member function, functions, methods
    void eat(){
        System.out.println("Eating");
    }

    String Sleep(){
        System.out.println("Sleeping");
        return null;
    }

    String food(int a ){

        System.out.println("walking");
        return null;
    }



}
