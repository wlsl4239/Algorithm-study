

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception	{
		System.setIn(new FileInputStream("res/input1216.txt"));

		Scanner sc = new Scanner(System.in);
		int T;

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int tc=sc.nextInt();
			int ans = 0;
			char [][] arr = new char[100][100];

			for(int i=0;i<100;i++) {
				String s = sc.next();
				for(int j=0;j<100;j++)
					arr[i][j] = s.charAt(j);
			}
			
			for(int n=1;n<=100;n++) {
				for(int i=0; i<100; i++) {
					for(int j=0;j<100 - (n-1);j++) {
						
						StringBuffer temp = new StringBuffer("");
						for(int k=0;k<n;k++) {
							temp.append(arr[i][j+k]);
						}
						
						if(temp.toString().equals(temp.reverse().toString()))
							ans = n;
					}
				}

				for(int i=0; i<100; i++) {
					for(int j=0;j<100 - (n-1);j++) {
						StringBuffer temp = new StringBuffer("");
						for(int k=0;k<n;k++) {
							temp.append(arr[j+k][i]);
						}
						if(temp.toString().equals(temp.reverse().toString()))
							ans = n;
					}
				}
			}
			System.out.println("#"+test_case+" " + ans);

		}
	}
}


