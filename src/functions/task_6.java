package functions;

public class task_6 {
    public static void main(String[] args) {
        universalMethod();
        universalMethod(42);
        universalMethod("Hello, world!");
        universalMethod(3.14);
        universalMethod(42, "Answer to everything");
        universalMethod(true);
        universalMethod(10, 20);
        universalMethod("A", "B");
        universalMethod(new int[]{1, 2, 3, 4, 5});
        universalMethod("Name", 25, true);
    }

    public static void universalMethod() {
        System.out.println("Universal method with no parameters called.");
    }

    public static void universalMethod(int a) {
        System.out.println("Universal method with integer parameter: " + a);
    }

    public static void universalMethod(String s) {
        System.out.println("Universal method with string parameter: " + s);
    }

    public static void universalMethod(double d) {
        System.out.println("Universal method with double parameter: " + d);
    }

    public static void universalMethod(int a, String s) {
        System.out.println("Universal method with integer and string parameters: " + a + ", " + s);
    }

    public static void universalMethod(boolean b) {
        System.out.println("Universal method with boolean parameter: " + b);
    }

    public static void universalMethod(int a, int b) {
        System.out.println("Universal method with two integer parameters: " + a + ", " + b);
    }

    public static void universalMethod(String s1, String s2) {
        System.out.println("Universal method with two string parameters: " + s1 + ", " + s2);
    }

    public static void universalMethod(int[] array) {
        System.out.print("Universal method with integer array parameter: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void universalMethod(String name, int age, boolean status) {
        System.out.println("Universal method with string, integer, and boolean parameters: " + name + ", " + age + ", " + status);
    }
}
