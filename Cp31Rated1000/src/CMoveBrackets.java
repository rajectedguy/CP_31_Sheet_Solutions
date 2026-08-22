import java.util.Scanner;

public class CMoveBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t-- > 0) {
            long n = scanner.nextLong();
            String s = scanner.next();

            long sum = 0;
            long ops = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == ')') {
                    sum--;
                } else {
                    sum++;
                }
                if (sum < 0) {
                    ops++;
                    sum = 0;
                }
            }
            System.out.println(ops);
        }
        scanner.close();
    }
}