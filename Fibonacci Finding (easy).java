 import java.io.*; import java.util.Scanner;

public class Solution { static long mod = 1000000007;

static long fib(long a, long b, long n) {
    long F[][] = new long[][] { { 1, 1 }, { 1, 0 } };
    long M[] = new long[] { b, a };
    if (n == 0) {
        return a;
    } else if (n == 1)
        return b;
    power(F, n - 1l);
    multiply(F, M);
    // System.out.println(F[0][0]+"\t"+F[0][1]+"\t"+F[1][0]+"\t"+F[1][1]+"\t");
    return M[0];
}

static void multiply(long F[][], long M[]) {
    long x = (F[0][0] * M[0] + F[0][1] * M[1]) % mod;
    long y = (F[1][0] * M[0] + F[1][1] * M[1]) % mod;
    M[0] = x;
    M[1] = y;
}

/*
 * Helper function that multiplies 2 matrices F and M of size 2*2, and puts the
 * multiplication result back to F[][]
 */
static void multiply(long F[][], long M[][]) {
    long x = (F[0][0] * M[0][0] + F[0][1] * M[1][0]) % mod;
    long y = (F[0][0] * M[0][1] + F[0][1] * M[1][1]) % mod;
    long z = (F[1][0] * M[0][0] + F[1][1] * M[1][0]) % mod;
    long w = (F[1][0] * M[0][1] + F[1][1] * M[1][1]) % mod;

    F[0][0] = x;
    F[0][1] = y;
    F[1][0] = z;
    F[1][1] = w;
}

/*
 * Helper function that calculates F[][] raise to the power n and puts the
 * result in F[][] Note that this function is designed only for fib() and won't
 * work as general power function
 */
static void power(long F[][], long n) {
    if (n == 0 || n == 1) {
        return;
    }
    long M[][] = new long[][] { { 1, 1 }, { 1, 0 } };

    power(F, n / 2);
    multiply(F, F);

    if (n % 2 != 0) {
        multiply(F, M);
    }
}

private static final Scanner scanner = new Scanner(System.in);

public static void main(String[] args) throws IOException {
    int t = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int tItr = 0; tItr < t; tItr++) {
        String[] abn = scanner.nextLine().split(" ");

        long a = Long.parseLong(abn[0]);

        long b = Long.parseLong(abn[1]);

        long n = Long.parseLong(abn[2]);

        long result = fib(a, b, n);

        System.out.println(result);

    }

    scanner.close();
}
}
