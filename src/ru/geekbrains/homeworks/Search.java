package ru.geekbrains.homeworks;

public class Search {

    public static int search (Integer[] arr) {
        int num = 0;


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == 1) {

            } else {
                num = arr[i - 1] + 1;
            }
        }
        return num;
    }
}

