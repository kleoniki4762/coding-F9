package gr.aueb.c9.cf9.ch1;

/**
 * To πρόγραμμα που ζητά από τον χρήστη δύο
 * δεκαδικούς αριθμούς και εμφανίζει το άθροισμά τους.
 * π.χ. ο χρήστης δίνει 2.5 και 3.1, και
 * το πρόγραμμα εμφανίζει Το άθροισμα είναι 5.60
 */

import java.util.Scanner;
import java.util.Locale;

public class ExerciseLocale {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double num1 =  2.5;
        double num2 = 3.1;
        double sum = num1 + num2;

        System.out.println("Το άθροισμα είναι: " + sum);

        System.out.printf("Το άθροισμα είναι: %.2f", sum);





    }

}
