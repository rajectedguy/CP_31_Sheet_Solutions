import java.util.Scanner;

public class AAmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int closest = a[0];
        for (int num : a) {
            if (Math.abs(num) < Math.abs(closest) ||
                    (Math.abs(num) == Math.abs(closest) && num > closest)) {
                closest = num;
            }
        }
        int toMakeZero = Math.abs(-closest);
        System.out.println(toMakeZero);
        sc.close();
    }
}