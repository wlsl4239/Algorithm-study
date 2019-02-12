import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int test=1;test<=t;test++) {
			int n = sc.nextInt();
			String s = sc.next();
			int arr[][] = new int[n][n];
			boolean arr2[][] = new boolean[n][n];
			
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					arr[i][j]= sc.nextInt();
			
			switch(s) {
			
			case "up":
				
				for(int i=1;i<n;i++) {
					for(int j=0;j<n;j++) {
						int nowy = i;
						int nowx = j;
						while(true) {
							if(nowy == 0 || arr[nowy][nowx]==0 || arr2[nowy-1][nowx] || (arr[nowy-1][nowx]!=0 && arr[nowy-1][nowx] != arr[nowy][nowx]))
								break;
							
							if(!arr2[nowy-1][nowx] && arr[nowy-1][nowx] == arr[nowy][nowx]) {
								arr[nowy-1][nowx] *= 2;
								arr[nowy][nowx] = 0;
								arr2[nowy-1][nowx] = true;
								break;
							}
							
							else if(arr[nowy-1][nowx] == 0) {
								arr[nowy-1][nowx] = arr[nowy][nowx];
								arr[nowy][nowx] = 0;
								nowy --;
							}
						}
					}
				}
				break;
			
			case "down":
				for(int i=n-2;i>=0;i--) {
					for(int j=0;j<n;j++) {
						int nowy = i;
						int nowx = j;
						while(true) {
							if(nowy == n-1 || arr[nowy][nowx]==0 || arr2[nowy+1][nowx] || (arr[nowy+1][nowx]!=0 && arr[nowy+1][nowx] != arr[nowy][nowx]))
								break;
							
							if(!arr2[nowy+1][nowx] && arr[nowy+1][nowx] == arr[nowy][nowx]) {
								arr[nowy+1][nowx] *= 2;
								arr[nowy][nowx] = 0;
								arr2[nowy+1][nowx] = true;
								break;
							}
							
							else if(arr[nowy+1][nowx] == 0) {
								arr[nowy+1][nowx] = arr[nowy][nowx];
								arr[nowy][nowx] = 0;
								nowy ++;
							}
						}
					}
				}				
				break;
				
			case "left":
				for(int i=0;i<n;i++) {
					for(int j=1;j<n;j++) {
						int nowy = i;
						int nowx = j;
						while(true) {
							if(nowx == 0 || arr[nowy][nowx]==0 || arr2[nowy][nowx-1] || (arr[nowy][nowx-1]!=0 && arr[nowy][nowx-1] != arr[nowy][nowx]))
								break;
							
							if(!arr2[nowy][nowx-1] && arr[nowy][nowx-1] == arr[nowy][nowx]) {
								arr[nowy][nowx-1] *= 2;
								arr[nowy][nowx] = 0;
								arr2[nowy][nowx-1] = true;
								break;
							}
							
							else if(arr[nowy][nowx-1] == 0) {
								arr[nowy][nowx-1] = arr[nowy][nowx];
								arr[nowy][nowx] = 0;
								nowx --;
							}
						}
					}
				}				
				break;
				
			case "right":
				for(int i=0;i<n;i++) {
					for(int j=n-2;j>=0;j--) {
						int nowy = i;
						int nowx = j;
						while(true) {
							if(nowx == n-1 || arr[nowy][nowx]==0 || arr2[nowy][nowx+1] || (arr[nowy][nowx+1]!=0 && arr[nowy][nowx+1] != arr[nowy][nowx]))
								break;
							
							if(!arr2[nowy][nowx+1] && arr[nowy][nowx+1] == arr[nowy][nowx]) {
								arr[nowy][nowx+1] *= 2;
								arr[nowy][nowx] = 0;
								arr2[nowy][nowx+1] = true;
								break;
							}
							
							else if(arr[nowy][nowx+1] == 0) {
								arr[nowy][nowx+1] = arr[nowy][nowx];
								arr[nowy][nowx] = 0;
								nowx ++;
							}
						}
					}
				}					
				break;
			}
			System.out.println("#"+test);
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++)
					System.out.print(arr[i][j]+" ");
				System.out.println();
			}
				
		}
	}
}
