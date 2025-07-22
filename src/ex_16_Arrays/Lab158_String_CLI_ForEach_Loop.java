package ex_16_Arrays;

public class Lab158_String_CLI_ForEach_Loop {
    public static void main(String[] args) {
        for (int i = 0;i< args.length;i++){
            System.out.println(args[i]);
        }

        System.out.println("**************");

        for(Object o : args){
            System.out.println(o);
        }

        int[] number = {23,45,32,12,33};
        for(int o: number){
            System.out.println(o);
        }

    }
}
