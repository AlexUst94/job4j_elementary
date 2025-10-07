package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        /* проверить. что массив word имеет последние элементы одинаковые с postfix */
        for (int i = 0; i < postfix.length; i++) {
            if (word[word.length - postfix.length + i] != postfix[i]) {
                return false;
            }
        }
        return result;
    }
}