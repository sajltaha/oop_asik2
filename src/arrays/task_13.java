package arrays;

import java.util.Scanner;

public class task_13 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("Maximum element is " + max);
    }
}
