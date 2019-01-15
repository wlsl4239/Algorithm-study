import java.io.FileInputStream;
import java.util.Scanner;

public class Solution{
	public static void main(String args[]) throws Exception	{
        Scanner sc = new Scanner(System.in);
		int T;

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int n=sc.nextInt();
			int ans = 0;
			char [][] arr = new char[8][8];

			for(int i=0;i<8;i++) {
				String s = sc.next();
				for(int j=0;j<8;j++)
					arr[i][j] = s.charAt(j);
			}

			for(int i=0; i<8; i++) {
				for(int j=0;j<8 - (n-1);j++) {
					StringBuffer temp = new StringBuffer("");
					for(int k=0;k<n;k++) {
						temp.append(arr[i][j+k]);
					}
					if(temp.toString().equals(temp.reverse().toString()))
						ans++;
				}
			}

			for(int i=0; i<8; i++) {
				for(int j=0;j<8 - (n-1);j++) {
					StringBuffer temp = new StringBuffer("");
					for(int k=0;k<n;k++) {
						temp.append(arr[j+k][i]);
					}
					if(temp.toString().equals(temp.reverse().toString()))
						ans++;
				}
			}
			System.out.println("#"+test_case+" " + ans);
		}
	}
}


