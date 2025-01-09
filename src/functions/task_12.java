package functions;

public class task_12 {
    public static String city = "Tokyo";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Jakarta", 25.3);
        printCityPopulation("Seoul", 25.2);
        printCityPopulation("Delhi", 23.1);
        printCityPopulation("New York", 21.6);
    }

    public static void printCityPopulation(String city, double population) {
        System.out.println("The population of the city " + city + " is " + population + " million.");

        System.out.println("While the most populous city " + task_12.city + " has a population of " + task_12.population + " million.");
    }
}
