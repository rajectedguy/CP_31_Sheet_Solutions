import java.util.Scanner;

public class ATwinPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int m = sc.nextInt();
            int[] arr = new int[m];
            int[] arr2 = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = sc.nextInt();
                arr2[i] = m + 1 -  arr[i];
            }
            for (int i = 0; i < m; i++) {
                System.out.print(arr2[i] + " ");
            }
            System.out.println();
        }
    }
}