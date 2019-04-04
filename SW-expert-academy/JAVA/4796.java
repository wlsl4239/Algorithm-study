import java.util.Scanner;
/*
높이들이 주어졌을 때 "우뚝 선 산" 찾기.
우뚝선 산은 높이가 올라갔다가 내려가는 모양임.	^ 모양.

arr : 높이										1 4 6 5 3 7 9 2 8
arr2 : 높이가 증가하는지(1) , 감소하는지(0)				 1 1 0 0 1 1 0 1
arr3 : arr2에서 1이 몇개연속되고 0이 몇개 연속되는지. 		2 2 2 1 1

arr2의 처음 숫자가 1이라면, i는 0부터 보면서  arr3[i]*arr[i+1]를 더해주면 되고
               0이라면, i는 1부터 보면서 arr3[i]*arr[i+1]를 더해주면 된다.
*/

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int test=1;test<=t;test++) {
			int n = sc.nextInt();
			int[] arr = new int [n];
			int[] arr2 = new int [n-1];
			int[] arr3 = new int [n];
			int ans = 0;
			for(int i=0;i<n;i++) 
				arr[i] = sc.nextInt();

			for(int i=0;i<n-1;i++) {
				if(arr[i]<arr[i+1]) 
					arr2[i] = 1;
				else 
					arr2[i] = 0;
			}
			
			int idx = 0;
			int startNum = arr2[0];
			arr3[0]++;
			for(int i=1;i<n-1;i++) {
				if(arr2[i]==arr2[i-1]) arr3[idx]++;
				else {
					idx++;
					arr3[idx]++;
				}
			}			
			
			for(int i=(startNum+1)%2; i<n; i+=2) {
				if(arr3[i]==0) break;
				ans += arr3[i] * arr3[i+1];
			}
			System.out.println("#"+test+" "+ans);
		}
	}
}	
