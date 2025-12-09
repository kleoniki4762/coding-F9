package gr.aueb.c9.cf9.Test;

//Υπολόγισε με for το εξής:
//10 − 9 − 8 − 7 − 6 − 5 - 4 - 3 - 2 − 1
// Aπό 10 αφαιρείς όλους τους αριθμούς μέχρι το 1.

public class For9 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 10;

        for (int i=1; i<=9; i++){
            sum = sum -i;

        }
        System.out.println(sum);
    }
}
