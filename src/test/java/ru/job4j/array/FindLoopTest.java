package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        /* Здесь нужно дописать тест, когда в массиве не найдено число 10.
        Можно искать любое другое число, корректно изменив при этом название теста */
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas35Then7() {
        int[] data = new int[]{3, 5, 12, 7, 15, 10, 22, 35, 49};
        int element = 35;
        int result = FindLoop.indexOf(data, element);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot45ThenMinus1() {
        int[] data = new int[]{22, 15, 16, 17, 44, 46, 49};
        int element = 45;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas111Then11() {
        int[] data = new int[]{33, 44, 45, 49, 52, 56, 2, 88, 112, 110, 222, 111, 4};
        int element = 111;
        int result = FindLoop.indexOf(data, element);
        int expected = 11;
        assertThat(result).isEqualTo(expected);
    }
}