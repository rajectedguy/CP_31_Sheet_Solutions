import java.util.Scanner;

public class ALineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i <n ; i++) {
                a[i] = sc.nextInt();
            }
            int maxgap = a[0];
            for (int i = 1; i < n; i++) {
                int gap = a[i] - a[i - 1];
                maxgap = Math.max(maxgap, gap);
            }
            maxgap = Math.max(maxgap, 2 * (x - a[n - 1]));
            System.out.println(maxgap);
        }
        sc.close();
    }
}


// LINK - https://codeforces.com/problemset/problem/1901/A