package gr.aueb.cf.cf9.ch1;

/**
 * Η κλάση SumApp προσθέτει δύο ακέραιους αριθμούς
 * και εμφανίζει το αποτέλεσμα στην οθόνη (κονσόλα).
 *
 * Δοκιμαστικά δεδομένα:
 * num1 = 19
 * num2 = 30
 *
 * Αναμενόμενο αποτέλεσμα:
 * Το αποτέλεσμα της πρόσθεσης είναι ίσο με 49.
 */
public class SumApp {
    public static void main(String[] args) {
        int num1 = 19;
        int num2 = 30;
        int sum = 0;

        sum = num1 + num2;

        System.out.println("Το αποτέλεσμα της πρόσθεσης είναι ίσο με " + sum);
    }
}
