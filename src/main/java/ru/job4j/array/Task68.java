package ru.job4j.array;

import java.util.StringJoiner;

public class Task68 {
    public static void array(int[] arr) {
        StringJoiner str = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            str.add(String.valueOf(arr[i]));
        }
        System.out.println(str.toString());
    }
}
