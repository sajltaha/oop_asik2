package functions;

public class task_8 {
    public static void main(String[] args) {
        System.out.println(cube(2));
        System.out.println(cube(-3));
        System.out.println(cube(10));
        System.out.println(cube(12345));
    }

    public static long cube(long number) {
        return number * number * number;
    }
}
