import java.util.Scanner;

public class BMEXorMixup {
    private static long xorTill(long n) {
        long a = n % 4;
        if (a == 0) {
            return n;
        } else if (a == 1) {
            return 1;
        } else if (a == 2) {
            return n + 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long arrXor = xorTill(a - 1);
            if (arrXor == b) {
                System.out.println(a);
            } else if ((arrXor ^ b) != a) {
                System.out.println(a + 1);
            } else {
                System.out.println(a + 2);
            }
        }
        scanner.close();
    }
}