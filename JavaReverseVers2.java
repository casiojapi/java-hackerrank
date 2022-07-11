public class Solution {
    public static void main(String[] args) {
        String str = "hello casinsky";
        System.out.println(reverseLib(str));
        System.out.prinrln(reverseMan(str));
    }

    public static String reverseLib(String s) {
        return new StringBuilder().reverse().toString();
    }

    public static String reverseMan(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) 
            sb.append(s.charAt(i));
        return sb.toString();
    }
}