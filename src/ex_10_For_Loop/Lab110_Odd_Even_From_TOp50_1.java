package ex_10_For_Loop;

public class Lab110_Odd_Even_From_TOp50_1 {
    public static void main(String[] args) {
        //Find the even nmber froms 1 to 50
        for(int i=1;i<=50;i++){
            if (i%2==0){
                System.out.println("Even");
            }else{
                System.out.println(i);
            }
        }
    }
}
