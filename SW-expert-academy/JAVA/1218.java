import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Stack;
public class Solution {

    public static void main(String args[]) throws Exception	{		
		Scanner sc = new Scanner(System.in);
		
		int T;		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			//T=sc.nextInt();
			
			int len = sc.nextInt();
			String str = sc.next();
			
			Stack sta1 = new Stack();
			Stack sta2 = new Stack();
			Stack sta3 = new Stack();
			Stack sta4 = new Stack();
			
			int ans = 1;
			
			for(int i=0;i<len;i++) {
				if(str.charAt(i) == '('){
					sta1.push(str.charAt(i));
				}
				else if(str.charAt(i) == ')'){
					if(sta1.empty()) {
						ans = 0;
						break;
					}			
					sta1.pop();
				}
				if(str.charAt(i) == '{'){
					sta2.push(str.charAt(i));
				}
				else if(str.charAt(i) == '}'){
					if(sta2.empty()) {
						ans = 0;
						break;
					}				
					sta2.pop();
				}
				if(str.charAt(i) == '['){
					sta3.push(str.charAt(i));
				}
				else if(str.charAt(i) == ']'){
					if(sta3.empty()) {
						ans = 0;
						break;
					}		
					sta3.pop();
				}
				if(str.charAt(i) == '<'){
					sta4.push(str.charAt(i));
				}
				else if(str.charAt(i) == '>'){
					if(sta4.empty()) {
						ans = 0;
						break;
					}			
					sta4.pop();
				}
			}
			
			if(!sta1.empty() || !sta2.empty() || !sta2.empty() || !sta2.empty())
				ans = 0;
			System.out.println("#"+test_case+" "+ans);	
		}
	}	
}
