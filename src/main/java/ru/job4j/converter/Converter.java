package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in1 = 140;
        float expected1 = 2;
        float out1 = Converter.rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2 euro. Test result : " + passed1);
        float in2 = 180;
        float expected2 = 3;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("180 rubles are 3 dollars. Test result : " + passed2);
    }
}
