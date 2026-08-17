import java.util.Scanner;

public class BTrianglesonaRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long w = scanner.nextLong();
            long h = scanner.nextLong();
            long area = Long.MIN_VALUE;
            for (int i = 0; i < 4; i++) {
                long k = scanner.nextLong();
                long first = 0, last = 0;
                for (int j = 0; j < k; j++) {
                    long x = scanner.nextLong();
                    if (j == 0) {
                        first = x;
                    }
                    if (j == k - 1) {
                        last = x;
                    }
                }
                long base = last - first;
                long height;
                if (i <= 1) {
                    height = h;
                } else {
                    height = w;
                }
                area = Math.max(area, base * height);
            }
            System.out.println(area);
        }
        scanner.close();
    }
}