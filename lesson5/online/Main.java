package lesson5.online;

import java.util.Arrays;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date of creation: 02.11.2020
 */

public class Main {

    public static void main(String[] args) {
//        int i = 32;
//        short s = (short) i;
//        short s1 = 32;
//        int i1 = s1;

        Toyota toyota = new Toyota("Toyota", 150, "White");
        Camry camry = new Camry("Camry", 180, "Black");
        Honda honda = new Honda("Honda", 250, "Green");
        FlyHonda flyHonda = new FlyHonda("FlyHonda", 300, "Red", 25);

        Car car1 = new Toyota("Toyota2", 150, "White");

        Car[] garage = {toyota, camry, honda, flyHonda};

        flyHonda.fly();

        for (int i = 0; i < garage.length; i++) {
            garage[i].move();
            garage[i].beep();
            if (garage[i] instanceof FlyHonda) {
//                FlyHonda flyHonda1 = (FlyHonda) garage[i];
//                flyHonda1.fly();
                ((FlyHonda) garage[i]).fly();
            }
        }

        String a = "abcde";
        int b = 45;
        a.length();

        Object[] arrayObj = new Object[3];
        arrayObj[0] = a;
        arrayObj[1] = b;
        arrayObj[2] = toyota;

//        for (int i = 0; i < arrayObj.length; i++) {
//            ((Car) arrayObj[i]).move();
//        }

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        if (Arrays.equals(arr1, arr2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}

/**
1. Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.

2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
В качестве параметра каждому методу передается величина, означающая или длину
препятствия (для бега и плавания), или высоту (для прыжков).

3. У каждого животного есть ограничения на действия
(бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).

4. При попытке животного выполнить одно из этих действий,
оно должно сообщить результат.
(Например, dog1.run(150); -> результат: 'Пёсик пробежал!')

5. * Добавить животным разброс в ограничениях.
То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

**/


