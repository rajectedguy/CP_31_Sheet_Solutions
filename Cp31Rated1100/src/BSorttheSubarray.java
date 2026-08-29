import java.util.Scanner;

public class BSorttheSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr2[i] = scanner.nextInt();
            }
            int change1 = -1, change2 = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] != arr2[i]) {
                    if (change1 == -1) {
                        change1 = i;
                    } else {
                        change2 = i;
                        break;
                    }
                }
            }
            int i = change1 - 1;
            while (i >= 0) {
                if (arr2[i] <= arr2[i + 1]) {
                    i--;
                } else {
                    break;
                }
            }
            change1 = i + 1;
            if (change2 == -1) {
                change2 = n - 1;
            }
            int j = change2 + 1;
            while (j < n) {
                if (arr2[j] >= arr2[j - 1]) {
                    j++;
                } else {
                    break;
                }
            }
            change2 = j - 1;
            System.out.println((change1 + 1) + " " + (change2 + 1));
        }
        scanner.close();
    }
}