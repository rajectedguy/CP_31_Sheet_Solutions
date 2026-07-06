import java.util.*;

public class AMakeitBeautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int i = 0;
            int j = n - 1;
            while (j >= i) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if (arr[0] == arr[n - 1]) {
                System.out.println("No");
            } else if (arr[0] == arr[1]) {
                int temp = arr[1];
                arr[1] = arr[n - 1];
                arr[n - 1] = temp;
                System.out.println("Yes");
                for (int value : arr) {
                    System.out.print(value + " ");
                }
                System.out.println();
            } else {
                System.out.println("Yes");
                for (int value : arr) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}