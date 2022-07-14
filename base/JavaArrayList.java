import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList> arr = new ArrayList<ArrayList>();
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            ArrayList row = new ArrayList();
            for (int j = 0; j < d; j++) {
                row.add(sc.nextInt());
            }
            arr.add(row);
        }
        
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(arr.get(x -1).get(y -1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
        
        
    }
}