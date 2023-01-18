package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] names = new String[4];
        names[0] = "papa";
        names[1] = "mama";
        names[2] = "deda";
        names[3] = "baba";
        System.out.println(names[3] + " " + names[0]);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + ages.length);
    }
}
