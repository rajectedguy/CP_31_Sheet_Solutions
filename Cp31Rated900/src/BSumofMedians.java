import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BSumofMedians {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            List<Long> v = new ArrayList<>();
            for (int i = 0; i < n * k; i++) {
                v.add(scanner.nextLong());
            }
            long pointer = n * k;
            long sum = 0;
            while (k-- > 0) {
                pointer -= (n / 2 + 1);
                sum += v.get((int) pointer);
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}