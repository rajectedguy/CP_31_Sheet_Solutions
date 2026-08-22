import java.util.Scanner;

public class AReverseaSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        String s = scanner.next();
        boolean flag = false;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                System.out.println("YES");
                System.out.println((i + 1) + " " + (i + 2));
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("NO");
        }
        scanner.close();
    }
}