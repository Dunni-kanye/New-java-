package Bike;

import java.util.Scanner;

public class TemperatureConverter {
    public static double toKelvin(double celsius) {
        return celsius + 273.15;
    }
    public static double toCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Temperature Conversion: ");
        System.out.println("1. Celsius to Kelvin");
        System.out.println("2. Kelvin To Celsius");
        System.out.println("Choose an option (1 or 2): ");
        int option = input.nextInt();

        switch(option) {
            case 1:
                System.out.println("Enter temperature in Celsius");
                double celsius = input.nextDouble();
                double kelvin = toKelvin(celsius);
                System.out.println("Celsius converted to Kelvin: " + kelvin);
                break;
                case 2:
                    System.out.println("Enter temperature in Kelvin");
                     kelvin = input.nextDouble();
                    celsius = toCelsius(kelvin);
                    System.out.println("Kelvin converted to Celsius: " + celsius);
                    break;
                    default:
                        System.out.println("Invalid option");
        }
    }
}
