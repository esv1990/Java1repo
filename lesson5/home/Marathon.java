package lesson5.home;

public class Marathon {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Мурзик", 2, 200, 1);
        Cat cat2 = new Cat("Barsik", 2, 200, 1);
        Dog dog = new Dog("Тузик", 0.5f, 500, 10);

        Animal[] arr = {cat1, cat2, dog};
        float toJump = 1.5f;
        float toRun = 350;
        float toSwim = 5;

        for (int i = 0; i < arr.length; i++) {
            String nameString = arr[i].getType() + " " + arr[i].getName() + " может ";

            String eventName = String.format("прыгнуть на %.2f м. Пытается прыгнуть на ", arr[i].getMaxJump());
            String eventResult = (arr[i].jump(toJump)) ? " это получилось" : " это не получилось";
            System.out.println(nameString + eventName + toJump + " м и" + eventResult);

            eventName = String.format("пробежать на %.2f м. Пытается пробежать на ", arr[i].getMaxRun());
            eventResult = arr[i].run(toRun) ? " это получилось" : " это не получилось";
            System.out.println(nameString + eventName + toRun + " м и" + eventResult);

            int swimResult = arr[i].swim(toSwim);
            eventName = String.format("проплыть на %.2f м. Попытка проплыть на ", arr[i].getMaxSwim());
            eventResult = (swimResult == Animal.SWIM_OK) ? " это получилось" : " это не получилось";
            if (swimResult == Animal.SWIM_NONE)
                eventResult = " это не получилось, т.к. не умеет плавать";
            System.out.println(nameString + eventName + toSwim + " м и" + eventResult);
        }
    }
}
