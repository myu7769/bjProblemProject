import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static long count;
    static final int MAXSIZE = 100;
    static long[] memo = new long[MAXSIZE];

    public static void main(String[] args) {
        Arrays.fill(memo, -1); // initialize memo with -1
        for (int n = 50; n <= 50; n++) {
            count = 0;
            System.out.printf("%d: %d: %d\n", n, fib(n), count);
        }
    }

    public static long fib(int n) {
        count++;
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        }

        if (memo[n] == -1) {
            memo[n] = fib(n - 2) + fib(n - 1);
        }

        return memo[n];
    }

}
