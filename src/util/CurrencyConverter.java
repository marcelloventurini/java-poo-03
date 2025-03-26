package util;

public class CurrencyConverter {
    public static Double IOF = 1.06;

    public static double convertCurrency(double dollarRate, double amount) {
        return dollarRate * amount * IOF;
    }
}
