package array1;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution5215_햄버거다이어트_서울9반_김경수 {

	static int n,l;

	static int[] score = new int[21];
	static int[] kcal = new int[21];
	static int ans = 0;
	
	public static void func(int nowidx,int nowcal,int nowscore) {
		if(nowidx == n) {
			ans = Integer.max(ans, nowscore);
			return;
		}
		
		if(l - nowcal >= kcal[nowidx])
			func(nowidx+1,nowcal+kcal[nowidx],nowscore+score[nowidx]);
		func(nowidx+1,nowcal,nowscore);
	}
	
	public static void main(String args[]) throws Exception
	{
		System.setIn(new FileInputStream("res/Solution5215_input.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			n=sc.nextInt();
			l=sc.nextInt();
			for(int i=0;i<n;i++) {
				score[i] = sc.nextInt();
				kcal[i] = sc.nextInt();
			}
			ans = 0;
			func(1,0,0);				//1번째 재료를 선택하지 않음.
			func(1,kcal[0],score[0]);	//1번쨰 재료를 선택함.
			
			System.out.println("#"+test_case+" " + ans);
			
		}
	}
}