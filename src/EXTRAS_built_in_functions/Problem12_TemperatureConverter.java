package EXTRAS_built_in_functions;

import java.util.Scanner;

public class Problem12_TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Convert from (C/F): ");
        String type = sc.nextLine();
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        if (type.equalsIgnoreCase("C")) {
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(temp));
        } else {
            System.out.println("Celsius: " + fahrenheitToCelsius(temp));
        }
        sc.close();    }

    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
