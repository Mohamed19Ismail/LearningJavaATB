package ex_18_OOPs_Constructor;

public class Lab177_PC {
    public static void main(String[] args) {
        BabyA b1 = new BabyA();
        BabyA b2 = new BabyA();
//        System.out.println(b1.name);
//        System.out.println(b2.name);

        BabyA b3 = new BabyA("Ismail","1234",1996,03,19);
        System.out.println(b3.name);
        System.out.println(b3.aadharnumber);
        System.out.println(b3.year);
        System.out.println(b3.month);

        BabyA b4 = new BabyA("Adam","2345",2021,21,19);
        System.out.println(b4.name);
        System.out.println(b4.aadharnumber);
        System.out.println(b4.year);
        System.out.println(b4.month);
    }
}

class BabyA{

    String name;
    String aadharnumber;
    int year;
    int month;
    int day;

    BabyA(){
        name = "buck";
        aadharnumber = "0000";
        year = 2000;
        month = 01;
        day = 1;
    }

    BabyA(String user_name, String user_aadharnumber, int user_year,int user_month,int user_day){

        this.name =user_name;
        this.aadharnumber = user_aadharnumber;
        this.year = user_year;
        this.month = user_month;
        this.day =user_day;

    }
}