import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char ch;
        String nu = "";
        /* Enter your code here. Print output to STDOUT. */
        for (int i=A.length() -1; i>= 0; i--) {
            ch= A.charAt(i);
            nu = nu+ ch;
        }
        if (nu.compareTo(A) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
