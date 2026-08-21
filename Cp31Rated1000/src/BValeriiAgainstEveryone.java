import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BValeriiAgainstEveryone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            Set<Long> uniqueElements = new HashSet<>();
            for (long element : a) {
                uniqueElements.add(element);
            }
            if (uniqueElements.size() < n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}