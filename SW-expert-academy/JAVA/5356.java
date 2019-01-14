package array2;

import java.io.FileInputStream;
import java.util.Scanner;

public class 5356 {
	public static void main(String args[]) throws Exception	{
		System.setIn(new FileInputStream("res/input5356.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringBuilder ans = new StringBuilder("");
			String arr[] = new String[5];
			int len = 0;
			
			for(int i=0;i<5;i++) {
				arr[i] = sc.next();
				len = (len<arr[i].length())?arr[i].length():len;
			}
				
			for(int i=0;i<len;i++) {
				for(int j=0;j<5;j++) {
					if(arr[j].length() <= i)
						continue;
					ans.append(arr[j].charAt(i));
				}
			}
			

			System.out.println("#" + test_case + " " + ans);
		}

	}

}
