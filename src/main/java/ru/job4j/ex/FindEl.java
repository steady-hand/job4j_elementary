package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
            if (rsl == -1) {
                throw new ElementNotFoundException("Такого элемента нет");
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            String[] test = {"0", "1", "2", "3"};
            indexOf(test, "7");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
