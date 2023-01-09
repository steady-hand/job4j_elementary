package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {

        double rslx = x2 - x1;
        double rsly = y2 - y1;
        double first = Math.pow(rslx, 2);
        double second = Math.pow(rsly, 2);
        double third = first + second;
        double rsl = Math.sqrt(third);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(2, 124, 2, 9);
        System.out.println("result (2, 124) to (2, 9) " + result);
    }
}
