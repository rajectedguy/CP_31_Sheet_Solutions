import java.util.Scanner;

public class AUnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int pos = 0;
            int neg = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 1) {
                    pos++;
                }else if (a[i] == -1) {
                    neg++;
                }
            }
            int ans = 0;
            while (neg > pos || neg % 2 == 1) {
                ans++;
                neg--;
                pos++;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}