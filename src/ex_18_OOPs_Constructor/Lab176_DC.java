package ex_18_OOPs_Constructor;

public class Lab176_DC {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "tesla";
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.Model);
    }
}

class Car{
    String name;
    int year;
    String Model;

    Car(){

        name = "Unknow car";
        year = 2000;
        Model = "qwe";
    }


}

