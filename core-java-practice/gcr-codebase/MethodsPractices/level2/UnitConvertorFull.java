package MethodsPractices.level2;

public class UnitConvertorFull {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5.0 / 9.0;
        return fahrenheit2celsius;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9.0 / 5.0) + 32;
        return celsius2fahrenheit;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        System.out.println("100°F      = " + convertFahrenheitToCelsius(100)  + "°C");
        System.out.println("37°C       = " + convertCelsiusToFahrenheit(37)   + "°F");
        System.out.println("10 pounds  = " + convertPoundsToKilograms(10)     + " kg");
        System.out.println("5 kg       = " + convertKilogramsToPounds(5)      + " pounds");
        System.out.println("3 gallons  = " + convertGallonsToLiters(3)        + " liters");
        System.out.println("10 liters  = " + convertLitersToGallons(10)       + " gallons");
    }
}