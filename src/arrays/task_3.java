package arrays;

public class task_3 {
    public static int[] array = new int[]{-1, 2, 3, -4, -5};
    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            if ((array[i] * -1) % 2 == 0) {
                array[i] *= -1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
