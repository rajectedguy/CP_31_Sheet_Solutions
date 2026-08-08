import java.util.Arrays;
import java.util.Scanner;

public class BBasketballTogether {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long d = scanner.nextLong();
        long[] a = new long[(int) n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }
        Arrays.sort(a);
        long left = -1;
        long right = n - 1;
        long teamSize = 1;
        long teams = 0;
        while (left < right) {
            if ((a[(int) right] * teamSize) <= d && left < right) {
                left++;
                teamSize++;
            } else {
                teams++;
                right--;
                teamSize = 1;
            }
        }
        System.out.println(teams);
        scanner.close();
    }
}