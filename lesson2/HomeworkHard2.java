package lesson2;

import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date of creation: 25.10.2020
 */

public class HomeworkHard2 {

    private static Scanner scanner = new Scanner(System.in);
    private static final int DOWN_BOUND = 1;
    private static final int UP_BOUND = 1;

    public static void main(String[] args) {

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] array1 = new int[rows][columns];
        array1 = fillArray(array1);
        printArray(array1);
        System.out.println();

        rows = scanner.nextInt();
        columns = scanner.nextInt();
        int[][] array2 = new int[rows][columns];
        array2 = fillArray(array2);
        printArray(array2);
        System.out.println();

        boolean flag = isSub(array1, array2);
        System.out.println();
        System.out.println(flag);
    }

    private static boolean isSub(int[][] array1, int[][] array2) {
        if (array1.length > array2.length)
            return false;
        if (array1[0].length > array2[0].length)
            return false;
        for (int k = 0; k < (array2.length - array1.length); k++) {
            for (int f = 0; f < (array2[0].length - array1[0].length); f++) {
                int count =0;
                for (int i = 0; i < array1.length; i++) {
                    for (int j = 0; j < array1[0].length; j++) {
                        if (array1[i][j] == array2[i+k][j+f])
                            count++;
                        if (count == array1.length * array1[0].length)
                            return true;
                    }
                }

            }
        }
        return false;
    }


    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] fillArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = DOWN_BOUND + (int) ((UP_BOUND - DOWN_BOUND + 1) * Math.random());
            }
        }
        return array;
    }


}
