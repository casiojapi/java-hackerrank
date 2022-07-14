import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        HashMap lib = new HashMap<String, Integer>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			Integer phone=in.nextInt();
			in.nextLine();
            lib.put(name, phone);
            
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if (lib.containsKey(s)) {
                System.out.println(s +"="+ lib.get(s));
            } else {
                System.out.println("Not found");
            }
		}
	}
}