package array1;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution1204_최빈수구하기_서울9반_김경수 {
	public static void main(String args[]) throws Exception	{
		System.setIn(new FileInputStream("res/Solution1204_input.txt"));

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for(int test_case = 1;test_case<=T;test_case++) {

			int n = sc.nextInt();
			int arr[] = new int [101];
			int ans = 0;
			int cnt = 0;

			for(int i=0;i<1000;i++) {
				int a = sc.nextInt();
				arr[a]++;
			}
			for(int i=0;i<=100;i++) {
				if(cnt <= arr[i]) {
					ans = i;
					cnt = arr[i];
				}
			}

			System.out.println("#"+n+" " + ans);
		}
	}
}