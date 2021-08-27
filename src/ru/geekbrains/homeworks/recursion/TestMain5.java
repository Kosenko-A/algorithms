package ru.geekbrains.homeworks.recursion;

import java.util.ArrayList;
import java.util.List;

public class TestMain5 {

    public static void main(String[] args) {

        System.out.println("Возведение числа в степень: ");
        System.out.println(elevate(5,3));

        System.out.println("Задача о рюкзаке:");

        List<Thing> things = new ArrayList<>();


        things.add( new Thing("Книга", 1, 600));
        things.add( new Thing("Бинокль", 2, 5_000));
        things.add( new Thing("Аптечка", 4, 1_500));
        things.add(  new Thing("Ноутбук", 2, 40_000));
        things.add( new Thing("Котелок", 1, 500));

        // Предположим, что максимальная вместимость рюкзака 8 кг
        Backpack backpack = new Backpack(8);
        backpack.findAllList(things);
        System.out.println(backpack.getBestThings());
        System.out.println("6 урок");

    }

    public static int elevate(int num, int degree) {
        if (degree < 1) {
            return 1;
        }
        int n = num * elevate(num, degree - 1);
        return n;
    }


}
