import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        for (int i =0; i < n; i++)
           arr[i] = sc.nextInt();
        int negatives = 0;
        for (int i =0; i < n; i ++){
            for (int j = 0; j < n; j++) {
               //if (i == j) continue;
               int sum = 0;
               for (int x = i; x <= j; x++) {
                   sum += arr[x];
               }
               if (sum < 0) {
                   negatives++;
               }
                    
           }
       }
       System.out.println(negatives);
       
    }
}