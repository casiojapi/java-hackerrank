import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// 2 4 4
//  2       -> hourglass
//1 2 4

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        
        bufferedReader.close();
        
        int max = -63;
        for (int i = 0; i < 4; i ++) {
            
            for (int j =0; j < 4; j ++) {
                int sum = 0;
                sum += arr.get(i).get(j );
                sum += arr.get(i).get(j + 1);
                sum += arr.get(i).get(j + 2);
                sum += arr.get(i + 1).get(j+1);
                sum += arr.get(i+2).get(j );
                sum += arr.get(i+2).get(j + 1);
                sum += arr.get(i+2).get(j + 2);
                if (sum > max)
                    max = sum;
                
            }
        }
        System.out.println(max);
    }
}
