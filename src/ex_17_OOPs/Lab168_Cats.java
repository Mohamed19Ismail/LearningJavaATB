package ex_17_OOPs;

public class Lab168_Cats {

    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2;
        c1.running();
        // c2.running(); we cant call the function or method without creating object

        new Cat().running();
    }

}

class Cat{

    String name;
    Cat(){
        System.out.println("mewo");
    }

    void running(){
        System.out.println("Running");
    }

}