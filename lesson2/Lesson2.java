package lesson2;

import java.util.Random;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date of creation: 22.10.2020
 */

public class Lesson2 {

    public static void main(String[] args) {
//    int a = 10;
//    int b= 12;
//    int c = (a < b) ? 35 : 45;
//        System.out.println(c);
//
//    if(a<b) {
//        c = a;
//    } else {
//        c = b;
//    }

//        String name = "Кирилл";

//        if (name == "Кирилл") {
//            System.out.println("Отправлено в офис 15");
//        } else if (name == "Александр") {
//            System.out.println("Отправлено в офис 25");
//        } else {
//            System.out.println("Вернуть отправителю");
//        }
//
//        switch (name) {
//            case "Кирилл":
//                System.out.println("Отправлено в офис 15");
//                break;
//            case "Александр":
//                System.out.println("Отправлено в офис 25");
//                break;
//            case "Ирина":
//                System.out.println("Отправлено в офис 35");
//                break;
////            default:
////                System.out.println("Вернуть отправителю");
//        }

//        for (int i = 10; i > 0; i--) {
//            System.out.println(i);
//        }
//
//        for (; ; ) {
//            System.out.println("text");
//        }

//        int a = 0;
//        while (a < 10) {
//            a++;
//            System.out.println(a);
//        }
//
//        while (true) {
//            System.out.println("text");
//        }
//        int b = 0;
//
//        do {
//            b++;
//            System.out.println(b);
//            if (b > 5) break;
//        } while (true);
//        System.out.println(power(2,10));
//        printPifagor(10, 10);
//        int a = 0;
//
//        {
//           int a1 = 0;
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

//        int[] array = new int[10];
//        String[] array1 = new String[10];
//        array[0] = 10;
//        array[5] = 20;
//        System.out.println(array1[6]);

//        int[] arrayBig = new int[100];
//        System.out.println(arrayBig.length);

//        for (int i = 0; i < arrayBig.length; i++) {
//            arrayBig[i] = i;
//            System.out.print(arrayBig[i]);
//        }

//        int[][] array2 = new int[10][5];

//        array2[2][3] = 5;

//        int[][][] array3 = new int[10][12][15];

//        for (int i = 0; i < array2.length; i++) {
//            for (int j = 0; j < array2[i].length; j++) {
//                array2[i][j] = i;
//                System.out.print(array2[i][j]);
//            }
//            System.out.println();
//        }

        Random random = new Random();
        System.out.println(random.nextInt());

        String qwerty = "qwertyuiop";
        int[] asdf = new int[10];
        System.out.println(qwerty.length());
        System.out.println(asdf.length);



//        checkPeople(arrayBig);
    }
//    public static int power(int base, int increment) {
//        int result = 1;
//
//        for (int i = 0; i < increment; i++) {
//            result *= base;
//        }
//        return result;
//    }

//    public static void printPifagor(int height, int width) {
//        for (int y = 0; y < height; y++) {
//            for (int x = 0; x < width; x++) {
//                System.out.print(x * y + "\t");
//            }
//            System.out.println();
//        }
//    }

//    public static void checkPeople(int[] inputArray){
//        inputArray[105] = 15;
//        System.out.println(inputArray[105]);
//    }


}

/**
    1 Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в
    принятом массиве 0 на 1, 1 на 0;

	2 Задать пустой целочисленный массив размером 8. Написать метод,
	который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;

	3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
	принимающий на вход массив и умножающий числа меньше 6 на 2;

	4 Задать одномерный массив. Написать методы поиска в нём
	минимального и максимального элемента;

	5 * Создать квадратный целочисленный массив
	(количество строк и столбцов одинаковое), заполнить его диагональные
	элементы единицами, используя цикл(ы);

	6 ** Написать метод, в который передается не пустой одномерный
	целочисленный массив, метод должен вернуть true если в массиве есть
	место, в котором сумма левой и правой части массива равны. Примеры:
	checkBalance([1, 1, 1, || 2, 1]) → true,
	checkBalance ([2, 1, 1, 2, 1]) → false,
	checkBalance ([10, || 1, 2, 3, 4]) → true.
	Абстрактная граница показана символами ||, эти символы в массив не входят.

	7 *** Написать метод, которому на вход подаётся одномерный массив и
	число n (может быть положительным, или отрицательным), при этом метод
	должен циклически сместить все элементы массива на n позиций.
	[1,2,3,4,5], -2 => [3,4,5,1,2]
	[1,2,3,4,5], 2 => [4,5,1,2,3]

	8 **** Не пользоваться вспомогательным массивом при решении задачи 7.

 */
