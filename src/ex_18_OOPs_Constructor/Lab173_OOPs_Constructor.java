package ex_18_OOPs_Constructor;

public class Lab173_OOPs_Constructor {

    public static void main(String[] args) {

        Baby b1 = new Baby();
        b1.sleep();
    }

}

class Baby{
    // Attribute | Instance Variable | Member variables, datra members
    String name;

    //Default Consturctor
    Baby(){
        System.out.println("I am called as Default constructor");

        //Fect data from th MySQL database
        //Read from CSV file, xlsx
        //Open a file and read the data

        // THis can used before calling any data required
    }




    //Behaviour
    void cry(){
        System.out.println("Cry");
    }

    void sleep(){
        System.out.println("sleep");
    }

    void eat(){
        System.out.println("eat");
    }
}