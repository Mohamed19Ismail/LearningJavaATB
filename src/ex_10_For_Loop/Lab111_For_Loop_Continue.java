package ex_10_For_Loop;

public class Lab111_For_Loop_Continue {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++){

            if(i==5){
                continue; //Skip the code and move to next line
            }
            System.out.println(i);
        }
    }
}
