import java.io.IOException;
import java.util.Scanner;

public class FEatingCandies {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] w = new int[n];
            for (int i = 0; i < n; i++) {
                w[i] = sc.nextInt();
            }
            int left = 0;
            int right = n - 1;
            long sumAlice = 0;
            long sumBob = 0;
            int maxCandies = 0;
            while (left <= right) {
                if (sumAlice <= sumBob) {
                    sumAlice += w[left];
                    left++;
                } else {
                    sumBob += w[right];
                    right--;
                }
                if (sumAlice == sumBob) {
                    maxCandies = left + (n - 1 - right);
                }
            }
            System.out.println(maxCandies);
        }
    }
}
