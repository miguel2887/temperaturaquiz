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
                        System.out.println(temperatura + "°C es igual a " + (temperatura * 9 / 5 + 32) + "°F");
                        break;
                    case 2:
                        System.out.println(temperatura + "°C es igual a " + (temperatura + 273.15) + "K");
                        break;
                    case 3:
                        System.out.println(temperatura + "°C es igual a " + ((temperatura + 273.15) * 9 / 5) + "°R");
                        break;
                    case 4:
                        System.out.println(temperatura + "°C es igual a " + (temperatura * 4 / 5) + "°Ré");
                        break;
                    case 5:
                        System.out.println(temperatura + "°F es igual a " + ((temperatura - 32) * 5 / 9) + "°C");
                        break;
                    case 6:
                        System.out.println(temperatura + "°F es igual a " + ((temperatura - 32) * 5 / 9 + 273.15) + "K");
                        break;
                    case 7:
                        System.out.println(temperatura + "°F es igual a " + (temperatura + 459.67) + "°R");
                        break;
                    case 8:
                        System.out.println(temperatura + "°F es igual a " + ((temperatura - 32) * 4 / 9) + "°Ré");
                        break;
                    case 9:
                        System.out.println(temperatura + "K es igual a " + (temperatura - 273.15) + "°C");
                        break;
                    case 10:
                        System.out.println(temperatura + "K es igual a " + ((temperatura - 273.15) * 9 / 5 + 32) + "°F");
                        break;
                    case 11:
                        System.out.println(temperatura + "K es igual a " + (temperatura * 9 / 5) + "°R");
                        break;
                    case 12:
                        System.out.println(temperatura + "K es igual a " + ((temperatura - 273.15) * 4 / 5) + "°Ré");
                        break;
                    case 13:
                        System.out.println(temperatura + "°R es igual a " + ((temperatura - 491.67) * 5 / 9) + "°C");
                        break;
                    case 14:
                        System.out.println(temperatura + "°R es igual a " + (temperatura - 459.67) + "°F");
                        break;
                    case 15:
                        System.out.println(temperatura + "°R es igual a " + (temperatura * 5 / 9) + "K");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número válido.");
                scanner.next();
            }
        } while (true);
    }
}

