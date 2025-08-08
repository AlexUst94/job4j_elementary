package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(double value) {
        // Assuming the conversion rate is 1 Euro = 90 Rubles
        return (float) (value / 90);
    }

    public static double rubleToDollar(double value) {
        // Assuming the conversion rate is 1 Dollar = 75 Rubles
        return value / 75;
    }
}
