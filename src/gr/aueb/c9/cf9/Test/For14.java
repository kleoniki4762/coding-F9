package gr.aueb.c9.cf9.Test;

//Φτιάξε πρόγραμμα που υπολογίζει το γινόμενο των αριθμών από το 1 μέχρι το 5.

public class For14 {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 1; i<=5; i++)
            sum = sum * i;
        System.out.println(sum);
    }

}
