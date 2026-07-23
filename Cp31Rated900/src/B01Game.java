import java.util.Scanner;

public class B01Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            int countOfOne = 0;
            int countOfZero = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    countOfZero++;
                } else {
                    countOfOne++;
                }
            }
            int operations = Math.min(countOfZero, countOfOne);
            if (operations % 2 != 0) {
                System.out.println("DA");
            } else {
                System.out.println("NET");
            }
        }
        scanner.close();
    }
}
