package lesson2;

import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date of creation: 25.10.2020
 */

public class HomeworkHard1 {

    private static Scanner scanner = new Scanner(System.in);
    private static final int DOWN_BOUND = 10;
    private static final int UP_BOUND = 99;

    public static void main(String[] args) {

        int sizeFirstArray;
        int sizeSecondArray;

        sizeFirstArray = scanner.nextInt();
        sizeSecondArray = scanner.nextInt();

        int[] array1 = new int[sizeFirstArray];
        fillArray(array1);
        printArray(array1);
        System.out.println();

        int[] array2 = new int[sizeSecondArray];
        fillArray(array2);
        printArray(array2);
        System.out.println();

        int count = howValue(array1, array2);
        System.out.println();

        int[] finalArray = new int[count];
        buildFinalArray(array1, array2, finalArray);
        printArray(finalArray);

    }

    private static void buildFinalArray(int[] array1, int[] array2, int[] finalArray) {
        int k = 0;
        for (int i = 0; i < array1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) flag = true;
            }
            if (!flag) {
                finalArray[k] = array1[i];
                k++;
            }
        }
    }

    private static int howValue(int[] array1, int[] array2) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) flag = true;
            }
            if (!flag) {
                count++;
            }
        }
        return count;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = DOWN_BOUND + (int) ((UP_BOUND - DOWN_BOUND + 1) * Math.random());
        }
    }
}
