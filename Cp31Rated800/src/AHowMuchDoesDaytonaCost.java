import java.util.Scanner;

public class AHowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            boolean isPresent = false;

            for ( int num: a){
                if (num == k){
                    isPresent = true;
                    break;
                }
            }

            if (isPresent){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
        sc.close();
    }
}