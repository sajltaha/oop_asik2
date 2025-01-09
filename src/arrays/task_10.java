package arrays;

import java.util.Scanner;

public class task_10 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number of array");
        int row = sc.nextInt();
        multiArray = new int[row][1];


        if (row > 0) {
            for (int i = 0; i < row; i++) {
                multiArray[i][0] = sc.nextInt();
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < 1; j++) {
                    for (int k = 1; k <= multiArray[i][j]; k++) {
                        System.out.print("[]" + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
