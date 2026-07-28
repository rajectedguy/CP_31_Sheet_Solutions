import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BMonsters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            List<long[]> healthPoints = new ArrayList<>();
            for (long i = 0; i < n; i++) {
                long x = scanner.nextLong();
                healthPoints.add(new long[]{x, i + 1});
            }
            for (long[] hp : healthPoints) {
                hp[0] = hp[0] % k;
                if (hp[0] == 0) {
                    hp[0] = k;
                }
            }
            healthPoints.sort((a, b) -> {
                if (a[0] != b[0]) {
                    return Long.compare(b[0], a[0]);
                }
                return Long.compare(a[1], b[1]);
            });
            for (long[] hp : healthPoints) {
                System.out.print(hp[1] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}