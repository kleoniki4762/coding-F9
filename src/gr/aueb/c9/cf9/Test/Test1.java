package gr.aueb.c9.cf9.Test;

//* Άσκηση 1 — Άθροισμα δύο αριθμών
//Ζήτα από τον χρήστη δύο αριθμούς και τύπωσε το άθροισμα.
//Input: 5, 7
//Output: Sum = 12

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 5;
        int num2 = 7;
        int sum = 12;

        System.out.println("Πληκτρολόγησε δύο αριθμούς");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1 + num2;

        System.out.printf("To άθροισμα των d% και %d είναι ίσο με %d/n, num1, num2, sum");
    }
}
