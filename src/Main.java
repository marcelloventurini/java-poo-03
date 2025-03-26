import util.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dollar rate: ");
        double dollarRate = scanner.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double amount = scanner.nextDouble();

        System.out.println("Amount to be paid in BRL: " + CurrencyConverter.convertCurrency(dollarRate, amount));

        scanner.close();
    }
}
