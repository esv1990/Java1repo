package lesson4;

import lesson4.home.Employee;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date of creation: 29.10.2020
 */

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "White", 4);
        Car car2 = new Car("LandCruiser", "Black", 3);
        Car car3 = new Car("UAZ");
        Car car4 = new Car("LandCruiser");
        System.out.println(car4.getMotor());

//        System.out.println(car4.model);
//        car4.model = "Yaguar";
//        System.out.println(car4.model);
//        car4.move();

//        System.out.println(Car.Motor.power);
//
//        System.out.println("Car " + car4.getModel() + " have count wheels = " + car4.getCountWheels());
//        car4.setModel("Uaz");
//        System.out.println(car4.getModel());


//        System.out.println(car3.model);
//        System.out.println(car3.color);
//        System.out.println(car3.countWheels);
//        Car car3 = new Car();

//        System.out.println(car1.model);
//        System.out.println(car1.countWheels);
//        System.out.println(car1.color);
//
//        System.out.println("Car 1 color " + car1.color);
//        System.out.println("Car 1 model " + car1.model);
//        System.out.println("Car 1 count wheels: " + car1.countWheels);
//
//        System.out.println("Car 2 color " + car2.color);
//        System.out.println("Car 2 model " + car2.model);
//        System.out.println("Car 2 count wheels: " + car2.countWheels);
//        System.out.println("Car 2 count model " + car2.model);

        System.out.println(car1);

        car1.move();
        car2.move();
        car2.beep();

        /**
         * 1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
         * 2 Конструктор класса должен заполнять эти поля при создании объекта;
         * 3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
         * 4 Вывести при помощи методов из пункта 3 ФИО и должность.
         * 5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
         * 6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
         * 7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.
         */


    }
}
