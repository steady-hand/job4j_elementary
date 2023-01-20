package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int i1 = 0; i1 < array.length; i1++) {
            for (int i2 = 0; i2 < array[i1].length; i2++) {
                int val = array[i1][i2];
                if (array[i1][i2] < 0) {
                    array[i1][i2] = 0;
                }
            }
        }
        return array;
    }
}
