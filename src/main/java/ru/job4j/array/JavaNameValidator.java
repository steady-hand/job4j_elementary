package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        char[] array = name.toCharArray();
        if (name.isEmpty()) {
            return false;
        }
        if (Character.isUpperCase(array[0])) {
            return false;
        }
        if (Character.isDigit(array[0])) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            int code = name.codePointAt(i);
            if (!isSpecialSymbol(code) && !isUpperLatinLetter(code) && !isLowerLatinLetter(code) && !Character.isDigit(code)) {
                return false;
            }
        }
        System.out.println(array);
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        boolean valid = false;
        if (code == 36 || code == 95) {
            valid = true;
        }
        return valid;
    }

    public static boolean isUpperLatinLetter(int code) {
        boolean valid = false;
        if (code >= 65 && code <= 90) {
            valid = true;
        }
        return valid;
    }

    public static boolean isLowerLatinLetter(int code) {
        boolean valid = false;
        if (code >= 97 && code <= 122) {
            valid = true;
        }
        return valid;
    }
}
