package lesson4.home;

public class Homework4 {

    public static void main(String[] args) {
        // 1.	Создать класс "Сотрудник" с полями: ФИО, должность, телефон,
        // зарплата, возраст;
        Employee e = new Employee("Александр", "Валерьевич",
                "Гладков", "8(495)000-11-22",
                "Test Manager", 80000, 1986);

        // 4.	Вывести при помощи методов из пункта 3 ФИО и должность.
        System.out.println("Please welcome our " + e.getPosition() + ", " +
                e.getName() + " " + e.getSecondName() + " " + e.getSurname() + ".");

        // 5.	Создать массив из 5 сотрудников. С помощью цикла вывести
        // информацию только о сотрудниках старше 40 лет;

        int[] array = new int[8];

        Employee[] employees = {
                e,
                new Employee("Андрей", "Андреевич",
                        "Андреев", "8(495)111-22-33",
                        "project owner", 520000, 1973),
                new Employee("Евгений", "Евгеньевич",
                        "Евгеньев", "8(495)222-33-44",
                        "project manager", 40000, 1963),
                new Employee("Наталья", "Натальевна",
                        "Натальева", "8(495)333-44-55",
                        "senior developer", 90000, 1990),
                new Employee("Тетенька", "Тетеньковна",
                        "Тетенькова", "8(495)444-55-66",
                        "engineer", 50000, 1983)
        };

        System.out.println("**********************************************");

        for (int i = 0; i < employees.length; i++)
            if (employees[i].getAge() > 40) {
                System.out.println(employees[i].getFullInfo());
            } else {
                System.out.println("Сотрудников не найдено");
            }

        System.out.println("**********************************************");

        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i].getFullInfo());

        increaseSalary(employees, 45, 5000);

        System.out.println("**********************************************");
        for (int i = 0; i < employees.length; i++)
            if (employees[i].isSalaryChanged)
                System.out.println(employees[i].getFullInfo());

    }

    // 6.	* Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
    // Метод должен принимать в качестве параметра массив сотрудников.
    // Вывести в main() возраст и зарплату сотрудника до и после вызова метода;
    private static void increaseSalary(Employee[] emp, int age, float increment) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > age) {
                emp[i].setSalary(increment);
                emp[i].isSalaryChanged = true;
            }
        }
    }
}
