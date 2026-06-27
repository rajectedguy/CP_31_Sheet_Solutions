import java.util.Scanner;

public class AGoalsofVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int[] a = new int[n-1];
            int sum = 0;
            for (int i = 0; i < n-1; i++) {
                a[i] = sc.nextInt();
                sum+=a[i];
            }
            System.out.println(-1*sum);
        }

        sc.close();
    }
}