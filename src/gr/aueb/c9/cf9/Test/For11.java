package gr.aueb.c9.cf9.Test;

//Με sum = 30 και αφαίρεσε όλους τους άρτιους αριθμούς από το 2 μέχρι το 10.

public class For11 {
    public static void main(String[] args) {
        int sum = 30;

        for (int i = 2; i <= 10; i = i + 2) {
            sum = sum - i;
        }

        System.out.println(sum);
    }
}

