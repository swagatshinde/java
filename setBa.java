package Ass1;
import java.util.*;
import java.util.TreeSet;

public class setBa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TreeSet automatically sorts elements and removes duplicates
        TreeSet<Integer> ts = new TreeSet<>();

        System.out.print("How many values: ");
        int n = sc.nextInt();

        System.out.println("Enter actual values: ");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ts.add(value);
        }

        System.out.println("The sorted values are: ");
        // Fixed: Removed semicolon and printing 'num' instead of 'ts'
        for (Integer num : ts) {
            System.out.println(num);
        }

        sc.close();
    }
}