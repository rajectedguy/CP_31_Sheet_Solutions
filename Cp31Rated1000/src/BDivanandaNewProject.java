import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BDivanandaNewProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            List<Pair> buildingMap = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                buildingMap.add(new Pair(a[i], i));
            }
            buildingMap.sort((p1, p2) -> Long.compare(p2.visits, p1.visits));
            long[] ans = new long[(int) n + 1];
            ans[0] = 0;
            long minutes = 0;
            long coordinate = 1;
            for (int i = 0; i < n; i++) {
                ans[buildingMap.get(i).index + 1] = coordinate;
                minutes += (2 * Math.abs(coordinate) * buildingMap.get(i).visits);
                if (coordinate < 0) {
                    coordinate = Math.abs(coordinate) + 1;
                } else {
                    coordinate = -coordinate;
                }
            }
            System.out.println(minutes);
            for (long x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
    static class Pair {
        long visits;
        int index;
        Pair(long visits, int index) {
            this.visits = visits;
            this.index = index;
        }
    }
}