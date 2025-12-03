package gr.aueb.c9.cf9.ch3;

import java.util.Scanner;

/**
 * Μετατρέπει μια θερμοκρασία από Fahrenheit σε Κελσίου.
 * Η μετατροπή γίνεται με τον τύπο (5/9) * (F - 32),
 * χρησιμοποιώντας ακέραιους αριθμούς (int).
 */
public class FahrenheitToCelsiusApp {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int fahrenheit = 0;
        int celsius = 0;

        // Είσοδος και επεξεργασία δεδομένων
        System.out.println("Παρακαλώ εισάγετε θερμοκρασία σε Fahrenheit:");
        fahrenheit = scanner.nextInt();
        celsius = (5 * (fahrenheit - 32)) / 9;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("%d°F αντιστοιχούν σε %d°C%n", fahrenheit, celsius);

        scanner.close();
    }
}
