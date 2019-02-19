import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int test=1;test<=t;test++) {
			int n = sc.nextInt();
			String s = sc.next();
			ArrayList<String> arr = new ArrayList<>();
			for(int i=0;i<s.length();i++) 
				arr.add(s.substring(i));
			Collections.sort(arr);
			
			System.out.println("#"+test+" "+arr.get(n-1));
		}
	}
}
