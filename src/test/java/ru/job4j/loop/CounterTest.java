package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {
    @Test
    void start0finosh5rezultat15() {
        int start = 0, finish = 5;
        int expected = 15;
        int resultat = Counter.sum(start, finish);
        assertThat(resultat).isEqualTo(expected);

    }

    @Test
    void start3finosh8rezultat33() {
        int start = 3, finish = 8;
        int expected = 33;
        int resultat = Counter.sum(start, finish);
        assertThat(resultat).isEqualTo(expected);

    }

    @Test
    void start1finosh1rezult1() {
        int start = 1, finish = 1;
        int expected = 1;
        int resultat = Counter.sum(start, finish);
        assertThat(resultat).isEqualTo(expected);

    }

    @Test
    void start10finosh2rezult0() {

        int start = 10, finish = 2;
        int expected = 0;
        int resultat = Counter.sum(start, finish);
        assertThat(resultat).isEqualTo(expected);
    }

    @Test
    void start0finosh10rezult30() {

        int start = 0, finish = 10;
        int expected = 30;
        int resultat = Counter.sumByEven(start, finish);
        assertThat(resultat).isEqualTo(expected);
    }

    @Test
    void start3finosh8rezult18() {

        int start = 3, finish = 8;
        int expected = 18;
        int resultat = Counter.sumByEven(start, finish);
        assertThat(resultat).isEqualTo(expected);
    }

    @Test
    void start1finosh1rezult0() {

        int start = 1, finish = 1;
        int expected = 0;
        int resultat = Counter.sumByEven(start, finish);
        assertThat(resultat).isEqualTo(expected);
    }

    @Test
    void startMinys2finosh10rezult28() {

        int start = -2, finish = 10;
        int expected = 28;
        int resultat = Counter.sumByEven(start, finish);
        assertThat(resultat).isEqualTo(expected);
    }
}
