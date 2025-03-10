
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double temperatura;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Celsius a Kelvin");
            System.out.println("3. Celsius a Rankine");
            System.out.println("4. Celsius a Réaumur");
            System.out.println("5. Fahrenheit a Celsius");
            System.out.println("6. Fahrenheit a Kelvin");
            System.out.println("7. Fahrenheit a Rankine");
            System.out.println("8. Fahrenheit a Réaumur");
            System.out.println("9. Kelvin a Celsius");
            System.out.println("10. Kelvin a Fahrenheit");
            System.out.println("11. Kelvin a Rankine");
            System.out.println("12. Kelvin a Réaumur");
            System.out.println("13. Rankine a Celsius");
            System.out.println("14. Rankine a Fahrenheit");
            System.out.println("15. Rankine a Kelvin");
            System.out.println("16. Salir");

            try {
                System.out.print("Ingrese su opción: ");
                opcion = scanner.nextInt();

                if (opcion < 1 || opcion > 16) {
                    System.out.println("Opción inválida. Por favor, ingrese un número entre 1 y 16.");
                    continue;
                }

                if (opcion == 16) {
                    break;
                }

                System.out.print("Ingrese la temperatura: ");
                temperatura = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println(temperatura + "°C es igual a " + celsiusToFahrenheit(temperatura) + "°F");
                        break;
                    case 2:
                        System.out.println(temperatura + "°C es igual a " + celsiusToKelvin(temperatura) + "K");
                        break;
                    case 3:
                        System.out.println(temperatura + "°C es igual a " + celsiusToRankine(temperatura) + "°R");
                        break;
                    case 4:
                        System.out.println(temperatura + "°C es igual a " + celsiusToReaumur(temperatura) + "°Ré");
                        break;
                    case 5:
                        System.out.println(temperatura + "°F es igual a " + fahrenheitToCelsius(temperatura) + "°C");
                        break;
                    case 6:
                        System.out.println(temperatura + "°F es igual a " + fahrenheitToKelvin(temperatura) + "K");
                        break;
                    case 7:
                        System.out.println(temperatura + "°F es igual a " + fahrenheitToRankine(temperatura) + "°R");
                        break;
                    case 8:
                        System.out.println(temperatura + "°F es igual a " + fahrenheitToReaumur(temperatura) + "°Ré");
                        break;
                    case 9:
                        System.out.println(temperatura + "K es igual a " + kelvinToCelsius(temperatura) + "°C");
                        break;
                    case 10:
                        System.out.println(temperatura + "K es igual a " + kelvinToFahrenheit(temperatura) + "°F");
                        break;
                    case 11:
                        System.out.println(temperatura + "K es igual a " + kelvinToRankine(temperatura) + "°R");
                        break;
                    case 12:
                        System.out.println(temperatura + "K es igual a " + kelvinToReaumur(temperatura) + "°Ré");
                        break;
                    case 13:
                        System.out.println(temperatura + "°R es igual a " + rankineToCelsius(temperatura) + "°C");
                        break;
                    case 14:
                        System.out.println(temperatura + "°R es igual a " + rankineToFahrenheit(temperatura) + "°F");
                        break;
                    case 15:
                        System.out.println(temperatura + "°R es igual a " + rankineToKelvin(temperatura) + "K");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número válido.");
                scanner.next();
            }
        } while (true);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double celsiusToRankine(double celsius) {
        return (celsius + 273.15) * 9 / 5;
    }

    public static double celsiusToReaumur(double celsius) {
        return celsius * 4 / 5;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public static double fahrenheitToRankine(double fahrenheit) {
        return fahrenheit + 459.67;
    }

    public static double fahrenheitToReaumur(double fahrenheit) {
        return (fahrenheit - 32) * 4 / 9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public static double kelvinToRankine(double kelvin) {
        return kelvin * 9 / 5;
    }

    public static double kelvinToReaumur(double kelvin) {
        return (kelvin - 273.15) * 4 / 5;
    }

    public static double rankineToCelsius(double rankine) {
        return (rankine - 491.67) * 5 / 9;
    }

    public static double rankineToFahrenheit(double rankine) {
        return rankine - 459.67;
    }

    public static double rankineToKelvin(double rankine) {
        return rankine * 5 / 9;
    }

    public static double rankineToReaumur(double rankine) {
        return (rankine - 491.67) * 4 / 9;
    }

}


