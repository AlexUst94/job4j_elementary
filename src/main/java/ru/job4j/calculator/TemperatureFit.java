package ru.job4j.calculator;

public class TemperatureFit {
    public static double idealTemperatureForFruits(int temperature) {
        // Идеальная температура для хранения фруктов в градусах Цельсия
        return temperature - 2.0;
    }

    public static double idealTemperatureForMeat(int temperature) {
        // Идеальная температура для хранения мяса в градусах Цельсия
        return temperature - 5.0;
    }

    public static void main(String[] args) {
        int temperature = 10; // Пример комнатной температуры
        double fruitsTemp = TemperatureFit.idealTemperatureForFruits(temperature);
        double meatTemp = TemperatureFit.idealTemperatureForMeat(temperature);
        System.out.println("Идеальная температура для фруктов: " + fruitsTemp + "°C");
        System.out.println("Идеальная температура для мяса: " + meatTemp + "°C");
    }
}