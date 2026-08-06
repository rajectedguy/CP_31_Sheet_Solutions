import java.util.Scanner;

public class CTrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t-- > 0) {
            long n = scanner.nextLong();
            char color = scanner.next().charAt(0);
            String s = scanner.next();
            s += s;
            n *= 2;
            long lastGreenIndex = -1;
            long maxSeconds = Integer.MIN_VALUE;
            for (int i = (int) n - 1; i >= 0; i--) {
                if (s.charAt(i) == 'g') {
                    lastGreenIndex = i;
                }
                if (s.charAt(i) == color) {
                    long difference = lastGreenIndex - i;
                    maxSeconds = Math.max(maxSeconds, difference);
                }
            }
            System.out.println(maxSeconds);
        }
        scanner.close();
    }
}