package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double first = p - a;
        double second = p - b;
        double third = p - c;
        double rsl = Math.sqrt(p * first * second * third);
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 3, 2);
        System.out.println("area (2, 3, 2) = " + rsl);
    }
}
