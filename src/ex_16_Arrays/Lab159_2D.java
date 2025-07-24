package ex_16_Arrays;

public class Lab159_2D {
    public static void main(String[] args) {
        //1.2.3
        //4,5,6
        //7,8,9

        int[][] array_2d_old = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] arr = {
                {10, 20},
                {30, 40},
                {50, 60}
        };
        int[][] array1 = new int[][]{
                {10, 20},
                {30, 40},
                {50, 60}};

        int[][] arr1 = new int[3][3];
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;

        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        arr1[2][0] = 7;
        arr1[2][1] = 8;
        arr1[2][2] = 9;

        System.out.println(arr1[1][2]);
    }
}
