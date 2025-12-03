package gr.aueb.c9.cf9.ch2;

public class Exers {
    public static void main(String[] args) {
        int x = 25;
        int y =  7;

        int sum = x + y;
        int sub = x - y;
        int mul = x * y;
        double div = (double) x / y;
        int mod = x % y;
        double avg = (x + y) / 2.0;

        System.out.printf("Sum: %d%nSub: %d%nMul: %d%n Div: %.2f%nMod: %d%nAvg: %.2f%n", sum, sub, mul,div, mod, avg);



    }
}
