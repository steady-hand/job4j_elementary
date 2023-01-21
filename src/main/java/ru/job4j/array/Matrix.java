package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i1 = 0; i1 < array.length; i1++) {
            for (int i2 = 0; i2 < array[i1].length; i2++) {
                array[i1][i2] = (i1 + 1) * (i2 + 1);
            }
        }
        return array;
    }
}
