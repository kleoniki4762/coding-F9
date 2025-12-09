package gr.aueb.c9.cf9.Test;

//*Γράψε μια for που υπολογίζει το άθροισμα των αριθμών από το 1 έως το 10
//και στο τέλος εμφανίζει το αποτέλεσμα.

public class For2 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;    // ή sum += i;
        }

        System.out.println("Το άθροισμα είναι: " + sum);
    }
}



