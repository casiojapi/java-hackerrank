import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        String chara = a.toLowerCase();
        String charb = b.toLowerCase();
        
        int[] apariciones = new int[27];
        for (int i = 0; i < 27; i++) {
            apariciones[i] = 0;
        }
        for (int i = 0; i < a.length(); i++) {
            char current_char = chara.charAt(i);
            int index = current_char - 'a' + 1;
            apariciones[index]++;
        }
            
        for (int i = 0; i < b.length(); i++) {
            char current_char = charb.charAt(i);
            int index = current_char - 'a'+ 1;
            apariciones[index]--;
        }
        for (int i = 0; i < 26; i++) {
            if (apariciones[i] != 0)
                return false;
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
