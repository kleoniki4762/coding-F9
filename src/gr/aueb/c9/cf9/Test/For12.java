package gr.aueb.c9.cf9.Test;

//Αφαίρεσε όλους τους αριθμούς που ξεκινούν από το 10 έως το 20
// int sum = 100;

public class For12 {
    public static void main(String[] args) {
        int sum = 100;

        for (int i = 10; i <=20; i = i + 3) {
            sum = sum - i;
        }

        System.out.println(sum);
    }
}

