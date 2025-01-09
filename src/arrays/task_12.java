package arrays;

public class task_12 {
    public static int[][] array = new int[][]{
            {
                    1, 2, 3
            },
            {
                    4, 5, 6
            }
    };
    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
