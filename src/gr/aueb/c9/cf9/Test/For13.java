package gr.aueb.c9.cf9.Test;

//Αφαίρεσε όλους τους αριθμούς που είναι πολλαπλάσια του 5, από το 5 μέχρι το 25.
// int sum = 60;

public class For13 {
    public static void main(String[] args) {
        int sum = 60;

        for (int i = 5; i <=25; i = i + 5) {
            sum = sum - i;
        }

        System.out.println(sum);
    }
}
