package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.offset;

class ConverterTest {
    @Test
    void whenConvert140RblThen1dot5555Euro() {
        double input = 140;
        double expected = 1.5555;
        double output = Converter.rubleToEuro(input);
        double precision = 0.0001;

        assertThat(output).isCloseTo(expected, offset(precision));
    }

    @Test
    void whenConvert200RblThen2dot2222Euro() {
        double input = 200;
        double expected = 2.2222;
        double output = Converter.rubleToEuro(input);
        double precision = 0.0001;

        assertThat(output).isCloseTo(expected, offset(precision));
    }
}
