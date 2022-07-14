import java.io.*;
import java.util.*;
import java.security.*;
import java.security.MessageDigest;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        MessageDigest digest = null;
        
        try {
            digest = MessageDigest.getInstance("SHA-256");
        } catch(NoSuchAlgorithmException e) {
            System.out.println("Something is wrong");
        }
        
        digest.reset();
        digest.update(sc.nextLine().getBytes());
        for (byte i: digest.digest()) {
            System.out.printf("%02x", i);
        }
        System.out.println();
    }
}