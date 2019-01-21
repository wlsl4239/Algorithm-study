//(괄호 포함) 문자열로 된 사칙연산 수식을 계산.

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	static int[] stack = new int[1000];
	static char[] stack2 = new char[1000];
	static int top = -1;
	static int top2 = -1;

	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			stack = new int[1000];
			stack2 = new char[1000];
			top = -1;
			top2 = -1;
			
			int n = sc.nextInt();
			String s = sc.next();
			StringBuilder sb = new StringBuilder();
  
   
			for(int i=0;i<s.length();i++) {
				char c = s.charAt(i);
				if('0'<=c && c<='9') {
					sb.append(c);
				}
				else if(c == ')') {
					char t = ' ';
					while((t = stack2[top2--]) != '(') {
						sb.append(t);
					}
				}
				else {
					while(getIcp(c) <= getIsp()) {
						char t = stack2[top2--];
						sb.append(t);
					}
					stack2[++top2] = c;
				}
			}			
			while(top2!=-1)
				sb.append(stack2[top2--]);
			
			s = sb.toString();
			
			for(int i=0;i<s.length();i++) {
				char c = s.charAt(i);
				if('0' <= c && c <= '9') {
					stack[++top] = c-'0';
				}
				else {
					int n2 = stack[top--];
					int n1 = stack[top--];
					int nn = 0;
					switch(c) {
					case '+':
						nn = n1+n2;
						break;
					case '-':
						nn = n1-n2;
						break;
					case '*':
						nn = n1*n2;
						break;
					case '/':
						nn = n1/n2;
						break;
					}
					stack[++top] = nn;
				}
			}
			System.out.println("#" + test_case + " " + stack[top]);
		}
	}
	
	public static int getIcp(char c) {
		switch(c) {
		case '+': case '-':
			return 1;
		case '*': case '/':
			return 2;
		case '(': 
			return 3;
		}
		return 0;
	}
	public static int getIsp() {
		char c = (top2==-1)? '(' : stack2[top2];

		switch(c) {
		case '+': case '-':
			return 1;
		case '*': case '/':
			return 2;
		case '(': 
			return 0;
		}
		return 0;		
	}
}


