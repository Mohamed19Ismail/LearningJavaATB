package ex_16_Arrays;

public class Lab162_2D_Array_Iterate_For_loop {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
            //j
       //i  //1 2 3
            //4 5 6
            //7 8 9

        for (int i=0;i<matrix.length;i++){
            for (int j = 0; j<matrix[i].length;j++){
                //System.out.print(matrix[i][j] + " | ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
