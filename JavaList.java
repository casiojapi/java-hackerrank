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
        List<Integer> lista = new ArrayList<>();
        for (int i =0; i < n; i++) {
            int ele = sc.nextInt();
            lista.add(ele);
        }
        int q = sc.nextInt();
        for (int i =0; i < q; i++) {
            String func = sc.next();
            if (func.equals("Insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                lista.add(x, y);
            } 
            else if (func.equals("Delete")) {
                int x = sc.nextInt();
                lista.remove(x);
            }
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%d ", lista.get(i));
        }
        System.out.println();
    }
}
