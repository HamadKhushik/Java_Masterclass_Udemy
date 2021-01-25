package arraysAndLists;

import java.util.Scanner;

/**
 * @author Hammad on 24/01/2021.
 * @project Java_Masterclass
 */
public class Arrays {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / (double) array.length;
    }

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Integer at " + i + " is " + myIntegers[i]);
        }
        System.out.println("Average of the array is " + getAverage(myIntegers));
    }
}
