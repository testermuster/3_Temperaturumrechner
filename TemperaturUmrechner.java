import java.util.Scanner;

public class TemperaturUmrechner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Temperaturumrechner");
            System.out.println("Wählen Sie den Modus:");
            System.out.println("1 - Fahrenheit in Celsius umrechnen");
            System.out.println("2 - Celsius in Fahrenheit umrechnen");

            int modus = scanner.nextInt();

            switch (modus) {
                case 1:
                    System.out.print("Geben Sie die Temperatur in Fahrenheit ein: ");
                    double fahrenheit = scanner.nextDouble();
                    double celsius = fahrenheitZuCelsius(fahrenheit);
                    System.out.println("Temperatur in Celsius: " + celsius);
                    break;
                case 2:
                    System.out.print("Geben Sie die Temperatur in Celsius ein: ");
                    celsius = scanner.nextDouble();
                    fahrenheit = celsiusZuFahrenheit(celsius);
                    System.out.println("Temperatur in Fahrenheit: " + fahrenheit);
                    break;
                default:
                    System.out.println("Ungültiger Modus!");
            }
        } finally {
            scanner.close();
        }
    }

    public static double fahrenheitZuCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusZuFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
