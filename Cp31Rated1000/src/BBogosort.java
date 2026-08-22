import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BBogosort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t-- > 0) {
            long n = scanner.nextLong();
            Long[] a = new Long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            Arrays.sort(a, Collections.reverseOrder());
            for (long ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}