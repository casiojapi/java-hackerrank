import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            System.out.println(isBalanced(input));
		}
	}
    
    static boolean isBalanced(String s) {
        Stack st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '[' || curr == '(' || curr == '{')
                st.push(curr);
            else if (st.empty()) {
                return false;
            } else {
                char first = (char)st.pop();
                if (curr == ')' && first != '(') 
                    return false;
                else if (curr == ']' && first != '[') 
                    return false;
                else if (curr == '}' && first != '{') 
                    return false;
            }
        }
        return st.isEmpty();
    }
}

