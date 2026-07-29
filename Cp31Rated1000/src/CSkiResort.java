import java.util.Scanner;

public class CSkiResort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            long q = scanner.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
                a[i] = (a[i] > q) ? 0 : 1;
            }
            long count_of_1s = 0;
            long ways = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == 1) {
                    count_of_1s++;
                } else {
                    if (count_of_1s >= k) {
                        long diff = count_of_1s - k + 1;
                        ways += (diff * (diff + 1)) / 2;
                    }
                    count_of_1s = 0;
                }
            }
            if (count_of_1s >= k) {
                long diff = count_of_1s - k + 1;
                ways += (diff * (diff + 1)) / 2;
            }
            System.out.println(ways);
        }
        scanner.close();
    }
}