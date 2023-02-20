package ru.job4j.ex;

public class FactRec {
    public static int calc(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int rsl;
            rsl = calc(n - 1) * n;
            return rsl;
        }
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}
