import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int test=1;test<=t;test++) {
			int n = sc.nextInt();
			String s = sc.next();
            String ans = "none";
			HashSet<String> arr = new HashSet<>();
			
			for(int j=1;j<=s.length();j++)
			for(int i=0;i<s.length()-j+1;i++) 
				arr.add(s.substring(i,i+j));
			ArrayList<String> arr2 = new ArrayList(arr);
            
			Collections.sort(arr2);
            
			
			if(n<=arr2.size())
				ans = arr2.get(n-1);
            
			System.out.println("#"+test+" "+ans);
		}
	}
}
