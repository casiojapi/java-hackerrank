import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s = s.trim();
        if (s.length() == 0) {
            System.out.println("0");
            return;
        }
        
        String[] res = s.split("[^A-Za-z]+");
        System.out.println(res.length);
        
            
        for (String words: res)
            System.out.println(words);
        
        scan.close();
    }
}
