import java.util.Scanner;

public class BFunwithEvenSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int target = a[n - 1];
            int ops = 0;
            int i = n - 1;
            while (i >= 0) {
                while (i >= 0 && a[i] == target) {
                    i--;
                }
                if (i >= 0) {
                    ops++;
                    int currentMatchCount = n - 1 - i;
                    i -= currentMatchCount;
                }
            }
            System.out.println(ops);
        }
        sc.close();
    }
}
