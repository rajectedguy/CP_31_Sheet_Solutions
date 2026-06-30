import java.util.Scanner;

public class ADesorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            boolean isNotSort = false;
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < n-1; i++) {
                if (a[i] > a[i+1]){
                    System.out.println(0);
                    isNotSort = true;
                    break;
                } else {
                    int k = ((a[i+1] - a[i]) / 2) + 1;;
                    ans = Math.min(ans,k);
                }
            }
            if (!isNotSort){
                System.out.println(ans);
            }

        }
        sc.close();
    }
}