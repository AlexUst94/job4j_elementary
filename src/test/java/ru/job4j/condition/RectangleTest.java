package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleTest {

    @Test
    void whenLength6AndWidth18ThenDiagonal18dot97() {
        double length = 6;
        double width = 18;
        double expected = 18.97;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength22AndWidth40ThenDiagonal45dot65() {
        double length = 22;
        double width = 40;
        double expected = 45.65;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength4AndWidth5ThenDiagonal6() {
        double length = 4;
        double width = 5;
        double expected = 6.0;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}