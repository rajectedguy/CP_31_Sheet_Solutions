import java.util.Scanner;

public class AJaggedSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            boolean changed;
            do {
                changed = false;
                for (int i = 1; i < n - 1; i++) {
                    if (a[i - 1] < a[i] && a[i] > a[i + 1]) {
                        int temp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                        changed = true;
                    }
                }
            } while (changed);
            boolean sorted = true;
            for (int i = 1; i < n; i++) {
                if (a[i - 1] > a[i]) {
                    sorted = false;
                    break;
                }
            }
            System.out.println(sorted ? "YES" : "NO");
        }
        sc.close();
    }
}