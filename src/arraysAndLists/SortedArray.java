package arraysAndLists;

import java.util.Scanner;

/**
 * @author Hammad on 24/01/2021.
 * @project Java_Masterclass
 * <p>
 * sort an array using brute force and insertion sort
 */
public class SortedArray {

    private int[] myArray;
    private static Scanner scanner = new Scanner(System.in);

    public void getIntegers(int number) {
        myArray = new int[number];
        System.out.println("Enter " + number + " integers");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }
    }

    public void printArray() {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element at position " + i + " is " + myArray[i]);
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at position " + i + " is " + array[i]);
        }
    }

    public int[] sortIntegers() {
        int[] sortedIntegers = new int[myArray.length];
        for (int i = 0; i < sortedIntegers.length; i++) {
            sortedIntegers[i] = myArray[i];
        }

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;

            for (int i = 0; i < sortedIntegers.length - 1; i++) {
                if (sortedIntegers[i] > sortedIntegers[i + 1]) {
                    temp = sortedIntegers[i];
                    sortedIntegers[i] = sortedIntegers[i + 1];
                    sortedIntegers[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedIntegers;
    }

    private int[] insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                j -= 1;
            }
            array[j + 1] = temp;
        }
        return array;
    }

    public int[] getMyArray() {
        return myArray;
    }

    public static void main(String[] args) {
        SortedArray sortedArray = new SortedArray();
        sortedArray.getIntegers(10);
        sortedArray.printArray();
        System.out.println("************Array sorted by brute force*********");
        sortedArray.printArray(sortedArray.sortIntegers());
        System.out.println("*************Array sorted by Insertion Sort *****");
        sortedArray.printArray(sortedArray.insertionSort(sortedArray.getMyArray()));
        System.out.println("******************Printing Original Array*******************");
    }

}
