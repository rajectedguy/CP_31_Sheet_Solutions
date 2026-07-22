import java.util.Scanner;

public class BLuntikandSubsequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            long countOfOnes = 0;
            long countOfZeros = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == 1) {
                    countOfOnes++;
                } else if (a[i] == 0) {
                    countOfZeros++;
                }
            }
            long ways = (long) Math.pow(2, countOfZeros) * countOfOnes;
            System.out.println(ways);
        }
        scanner.close();
    }
}