package gr.aueb.c9.cf9.ch1;

import java.util.Scanner;

/**
 * Ζητά ηλικία και αν υπάρχει φοιτητικό πάσο.
 * Επιτρέπεται η είσοδος αν (ηλικία >= 18) Ή (έχει πάσο).
 */
public class CinemaAccessApp {
    public static void main(String[] args) {
        // Δήλωση & Αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        boolean isAdult = false;
        boolean hasStudentID = false;
        boolean canEnter = false;

        // Είσοδος δεδομένων
        System.out.println("Πληκτρολόγησε την ηλικία σου:");
        age = scanner.nextInt();

        System.out.println("Έχεις φοιτητικό πάσο; Πληκτρολόγησε true/false:");
        hasStudentID = scanner.nextBoolean();

        // Επεξεργασία
        isAdult = age >= 18;
        canEnter = isAdult || hasStudentID;

        // Εκτύπωση αποτελεσμάτων (πρώτα println, μετά printf)
        System.out.println("Επιτρέπεται η είσοδος: " + canEnter);
        System.out.printf("Επιτρέπεται η είσοδος: %b%n", canEnter);

        // (προαιρετικά) δείξε και τα ενδιάμεσα για έλεγχο
        System.out.println("isAdult = " + isAdult + ", hasStudentID = " + hasStudentID);
        System.out.printf("isAdult = %b, hasStudentID = %b%n", isAdult, hasStudentID);

        scanner.close();
    }
}



