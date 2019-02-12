import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static int n;
	static int ans = -1;

	static void func(int cnt,int[][] arr) {
		if(cnt==5) {
			ans = Math.max(ans,findMax(arr));	
			return;
		}
		ans = Math.max(ans,findMax(arr));

		func(cnt+1,up(arr));
		func(cnt+1,down(arr));
		func(cnt+1,left(arr));
		func(cnt+1,right(arr));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[][];
		n = sc.nextInt();
		arr = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr[i][j]= sc.nextInt();
		ans = findMax(arr);
		func(0,arr);
		System.out.println(ans);		
	}	

	static int findMax(int arr[][]) {
		int max = -1;
		for (int[] is : arr) {
			for (int is2 : is) {
				max = Math.max(max, is2);
			}
		}
		return max;
	}
	static int[][] up(int arr[][]) {

		int[][] arr1 = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr1[i][j] = arr[i][j];
		
		boolean arr2[][] = new boolean[n][n];
		for(int i=1;i<n;i++) {
			for(int j=0;j<n;j++) {
				int nowy = i;
				int nowx = j;
				while(true) {
					if(nowy == 0 || arr1[nowy][nowx]==0 || arr2[nowy-1][nowx] || (arr1[nowy-1][nowx]!=0 && arr1[nowy-1][nowx] != arr1[nowy][nowx]))
						break;

					if(!arr2[nowy-1][nowx] && arr1[nowy-1][nowx] == arr1[nowy][nowx]) {
						arr1[nowy-1][nowx] *= 2;
						arr1[nowy][nowx] = 0;
						arr2[nowy-1][nowx] = true;
						break;
					}

					else if(arr1[nowy-1][nowx] == 0) {
						arr1[nowy-1][nowx] = arr1[nowy][nowx];
						arr1[nowy][nowx] = 0;
						nowy --;
					}
				}
			}
		}

		return arr1;
	}
	static int[][] down(int arr[][]) {

		int[][] arr1 = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr1[i][j] = arr[i][j];

		boolean arr2[][] = new boolean[n][n];

		for(int i=n-2;i>=0;i--) {
			for(int j=0;j<n;j++) {
				int nowy = i;
				int nowx = j;
				while(true) {
					if(nowy == n-1 || arr1[nowy][nowx]==0 || arr2[nowy+1][nowx] || (arr1[nowy+1][nowx]!=0 && arr1[nowy+1][nowx] != arr1[nowy][nowx]))
						break;

					if(!arr2[nowy+1][nowx] && arr1[nowy+1][nowx] == arr1[nowy][nowx]) {
						arr1[nowy+1][nowx] *= 2;
						arr1[nowy][nowx] = 0;
						arr2[nowy+1][nowx] = true;
						break;
					}

					else if(arr1[nowy+1][nowx] == 0) {
						arr1[nowy+1][nowx] = arr1[nowy][nowx];
						arr1[nowy][nowx] = 0;
						nowy ++;
					}
				}
			}
		}			
		return arr1;		
	}
	static int[][] left(int arr[][]) {

		int[][] arr1 = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr1[i][j] = arr[i][j];
		
		boolean arr2[][] = new boolean[n][n];

		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				int nowy = i;
				int nowx = j;
				while(true) {
					if(nowx == 0 || arr1[nowy][nowx]==0 || arr2[nowy][nowx-1] || (arr1[nowy][nowx-1]!=0 && arr1[nowy][nowx-1] != arr1[nowy][nowx]))
						break;

					if(!arr2[nowy][nowx-1] && arr1[nowy][nowx-1] == arr1[nowy][nowx]) {
						arr1[nowy][nowx-1] *= 2;
						arr1[nowy][nowx] = 0;
						arr2[nowy][nowx-1] = true;
						break;
					}

					else if(arr1[nowy][nowx-1] == 0) {
						arr1[nowy][nowx-1] = arr1[nowy][nowx];
						arr1[nowy][nowx] = 0;
						nowx --;
					}
				}
			}
		}			
		return arr1;
	}
	static int[][] right(int arr[][]) {

		int[][] arr1 = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr1[i][j] = arr[i][j];
		
		boolean arr2[][] = new boolean[n][n];

		for(int i=0;i<n;i++) {
			for(int j=n-2;j>=0;j--) {
				int nowy = i;
				int nowx = j;
				while(true) {
					if(nowx == n-1 || arr1[nowy][nowx]==0 || arr2[nowy][nowx+1] || (arr1[nowy][nowx+1]!=0 && arr1[nowy][nowx+1] != arr1[nowy][nowx]))
						break;

					if(!arr2[nowy][nowx+1] && arr1[nowy][nowx+1] == arr1[nowy][nowx]) {
						arr1[nowy][nowx+1] *= 2;
						arr1[nowy][nowx] = 0;
						arr2[nowy][nowx+1] = true;
						break;
					}

					else if(arr1[nowy][nowx+1] == 0) {
						arr1[nowy][nowx+1] = arr1[nowy][nowx];
						arr1[nowy][nowx] = 0;
						nowx ++;
					}
				}
			}
		}					
		return arr1;
	}
}
