package lesson6.online;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date of creation: 05.11.2020
 */

public class Lesson6 extends Object {


//    static Sample sample = new Sample();

    public static void main(String[] args) throws IOException {
        System.out.println("Class Main started");

//        Scanner scanner = new Scanner(System.in);
//        String s0 = "Hello_world";
//        String s1 = "Hello";
//        s1 += "_world";
//        String s2 = scanner.nextLine();
//        String s3 = "Hello_world";
//
//        System.out.println(s0 == s1);
//        System.out.println(s0 == s2);
//        System.out.println(s0 == s3);
//
//        System.out.println(s0.equals(s1));
//        System.out.println(s0.equals(s2));
//        System.out.println(s0.equals(s3));

//        long startTime = System.nanoTime();
//        String e = "Example"; //String e = new String("Example");
//        for (int i = 0; i < 50000; i++) {
//            e += i;
//        }
//
//        float deltaTime = System.nanoTime() - startTime;
//        System.out.println(e);
//        System.out.println("Work string = " + deltaTime * 0.000001f + " millisec");
//
//        startTime = System.nanoTime();
//
        StringBuilder e1 = new StringBuilder("Example");
//        for (int i = 0; i < 50000; i++) {
//            e1.append(i);
//        }
//        deltaTime = System.nanoTime() - startTime;
//        System.out.println("Work stringBuilder = " + deltaTime * 0.000001f + " millisec");
//        System.out.println(e1.toString());
//        System.out.println(e.equals(e1.toString()));
////
////        System.out.println("Class Main ended");
//        StringBuilder stringBuilder = new StringBuilder("Hello");
//        System.out.println(stringBuilder);
//        method1();
//        if (sample != null) {
//
//        }
//        sample.doSomething();
////        System.out.println(10/0);
//
//        method1();
//        try {
//            System.out.println(10/0);
//        } catch (Exception e) {
//            System.out.println(e.getStackTrace());
//        }

        InputStream io;
        OutputStream ou;

//        FileInputStream fis;
//        FileOutputStream fos;

//        try {
//            FileOutputStream fos = new FileOutputStream("text.txt");
//            PrintStream ps = new PrintStream(fos);
//            byte[] b = "Hello!".getBytes();
////            fos.write(b);
//            ps.println("Hello_world");
//            ps.close();
////            fos.close();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//            FileInputStream fis = new FileInputStream("text1.txt");
//            int singleCharFile;
//            while ((singleCharFile = fis.read()) != -1) {
//                System.out.print((char) singleCharFile);
//            }


//        try {
//            FileInputStream fis = new FileInputStream("text1.txt");
//            int singleCharFile;
//            while ((singleCharFile = fis.read()) != -1) {
//                System.out.print((char) singleCharFile);
//            }
//        } catch (IOException exception) {
//            System.out.println("Error write file" + exception.getMessage());
//        }



        System.out.println("Class Main ended");
    }

//    private static void method1() throws IOException {
//        try {
//            throw new IOException("Exception from method");
//        } catch (Throwable e) {
//            System.out.println("Caught:" + e.getMessage());
//        }
//    }
//
//    private static class Sample {
//        private void doSomething() {
//            System.out.println("Method in sample");
//        }
//    }
}

/*
1.	Создать 2 текстовых файла, примерно по 50-100 символов в каждом
(особого значения не имеет);

2.	Написать программу, «склеивающую» эти файлы, то есть вначале идет текст
из первого файла, потом текст из второго.

3.	* Написать программу, которая проверяет присутствует ли указанное
пользователем слово в файле.

4.  ** Написать метод, проверяющий, есть ли указанное слово в папке
*/
