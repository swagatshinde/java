 // Q.Accept 'n' integer from the user.store and display integer in sorted order having proper collection class.
// The collection should not accept duplicate elements.
// created treeset object.
// treeset sort value automatically.
// Purpose of add() method: Adds a single value to a group.
// the for-each loop visits every single element in the collection from start to finish.


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
