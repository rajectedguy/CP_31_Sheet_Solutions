import java.util.Scanner;

public class BMultiplyby2divideby6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long countOf3 = 0;
            long countOf2 = 0;
            while (n > 0 && n % 3 == 0) {
                countOf3++;
                n /= 3;
            }
            while (n > 0 && n % 2 == 0) {
                countOf2++;
                n /= 2;
            }
            if (n > 1 || countOf2 > countOf3) {
                System.out.println(-1);
            } else {
                System.out.println(countOf3 + (countOf3 - countOf2));
            }
        }
        scanner.close();
    }
}