package ex_06_Ternary_Operator;

public class Lab067_Real_Age_classification {
    public static void main(String[] args) {
        //age = 23
        //age < 18 == Minor
        //18 < age > 65 = Adult
        //age > 65 = Senior Citizen

        int age = 24;
        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior Citizen";
        System.out.println(result);
    }
}
