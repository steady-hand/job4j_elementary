package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean maximum = left > right;
        int result = maximum ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        return (max(max(first, second), third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return (max(first, second, max(third, fourth)));
    }

    public static void main(String[] args) {
        int result = Max.max(5, 8);
        System.out.println("max value = " + result);
        result = Max.max(8, 8);
        System.out.println("max value = " + result);
        result = Max.max(18, 8);
        System.out.println("max value = " + result);
    }

}
