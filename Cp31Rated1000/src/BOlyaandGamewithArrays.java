import java.util.*;

public class BOlyaandGamewithArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t-- > 0) {
            long n = scanner.nextLong();
            List<Long> secondElements = new ArrayList<>();
            long lowestFirstMinimum = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                long m = scanner.nextLong();
                long[] a = new long[(int) m];
                for (int j = 0; j < m; j++) {
                    a[j] = scanner.nextLong();
                }
                Arrays.sort(a);
                secondElements.add(a[1]);
                lowestFirstMinimum = Math.min(lowestFirstMinimum, a[0]);
            }
            Collections.sort(secondElements);

            long sumOfSecondElements = 0;
            for (long element : secondElements) {
                sumOfSecondElements += element;
            }
            long lowestSecondMinimum = secondElements.get(0);
            long answer = lowestFirstMinimum + sumOfSecondElements - lowestSecondMinimum;
            System.out.println(answer);
        }
        scanner.close();
    }
}