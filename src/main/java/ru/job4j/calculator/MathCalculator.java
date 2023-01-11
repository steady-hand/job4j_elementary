package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumMinAndDiv(double first, double second) {
        return minus(first, second)
                + division(first, second);
    }

    public static double sumTotal(double first, double second) {
        return minus(first, second)
                + division(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumTotal(10, 20));
    }
}