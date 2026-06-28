import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class AUnitedWeStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
            boolean isDiff = true;
            for (int i = 1; i < n; i++) {
                if (!Objects.equals(a.get(i), a.get(0))){
                    isDiff = false;
                    break;
                }
            }
            if (isDiff){
                System.out.println(-1);
                continue;
            }
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();
            int max = Collections.max(a);
            for (int i = 0; i < n; i++) {
                if (max != a.get(i)){
                    b.add(a.get(i));
                } else {
                    c.add(a.get(i));
                }
            }
            System.out.println(b.size() + " " + c.size());
            for (Integer integer : b) {
                System.out.print(integer + " ");
            }
            System.out.println();
            for (Integer integer : c) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
 
package Cp31Rated800;
 
import java.util.*;
 
public class AUnitedWeStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
 
            Collections.sort(a);
 
            boolean allEqual = true;
            for (int i = 1; i < n; i++) {
                if (!Objects.equals(a.get(i), a.get(0))) {
                    allEqual = false;
                    break;
                }
            }
 
            if (allEqual) {
                System.out.println(-1);
                continue;
            }
 
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();
 
            int smallest = a.get(0);
            c.add(smallest);
            for (int i = 1; i < n; i++) {
                if (a.get(i) % smallest == 0) {
                    c.add(a.get(i));
                } else {
                    b.add(a.get(i));
                }
            }
 
            System.out.println(b.size() + " " + c.size());
            for (Integer x : b) System.out.print(x + " ");
            System.out.println();
            for (Integer x : c) System.out.print(x + " ");
            System.out.println();
        }
        sc.close();
    }
}
 
 
 */