package gr.aueb.c9.cf9.Test;

// Χρησιμοποίησε μία for για να αφαιρέσεις τους αριθμούς:
// Int sum =50;
// 5, 7, 9, 11, 13
public class For10 {
    public static void main(String[] args) {
        int sum = 50;

        for (int i = 5; i <= 13; i = i + 2) {
            sum = sum - i;
        }

        System.out.println(sum);
    }
}
