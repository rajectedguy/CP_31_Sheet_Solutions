import java.util.*;

public class BShoeShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long[] sizes = new long[(int) n];
            for (int i = 0; i < n; i++) {
                sizes[i] = scanner.nextLong();
            }
            Map<Long, Long> freq = new HashMap<>();
            for (long size : sizes) {
                freq.put(size, freq.getOrDefault(size, 0L) + 1);
            }
            boolean flag = false;
            for (long count : freq.values()) {
                if (count == 1) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println(-1);
                continue;
            }
            List<Long> students = new ArrayList<>();
            for (long i = 1; i <= n; i++) {
                students.add(i);
            }
            int l = 0, r = 0;
            while (r < n) {
                if (sizes[l] == sizes[r]) {
                    r++;
                } else {
                    Collections.rotate(students.subList(l, r), -1);
                    l = r;
                }
            }
            Collections.rotate(students.subList(l, r), -1);
            for (long student : students) {
                System.out.print(student + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}