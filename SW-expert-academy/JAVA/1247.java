import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	static int[] x,y,arr;
	static int ans,sx,sy,ex,ey;
	
	static int distance(int x1,int x2,int y1,int y2) {
		return Math.abs(x1-x2)+Math.abs(y1-y2);
	}
	
	static void swap(int a,int b) {
		int T=arr[a];arr[a]=arr[b];arr[b]=T;
	}
	
	public static void perm(int n,int k) {
		if(k==n) {
			int temp = distance(sx,x[arr[0]],sy,y[arr[0]])+		//회사 - 첫번째방문 거리
					distance(ex,x[arr[n-1]],ey,y[arr[n-1]]);	//마지막방문 - 집 거리
			
			for(int i=0;i<n-1;i++) 
				temp+=distance(x[arr[i]],x[arr[i+1]],y[arr[i]],y[arr[i+1]]);	//각 방문들 거리
			ans = Math.min(ans, temp);
			
			return;
		}
		for(int i=k;i<n;i++) {
			swap(k,i);
			perm(n,k+1);
			swap(k,i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int test=1;test<=t;test++) {
			int n = sc.nextInt();
			x = new int[n];
			y = new int[n];
			arr = new int[n];
			ans = Integer.MAX_VALUE;
			
			sx = sc.nextInt();
			sy = sc.nextInt();
			ex = sc.nextInt();
			ey = sc.nextInt();
			
			for(int i=0;i<n;i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				arr[i] = i;
			}
			perm(n,0);
			System.out.println("#"+test+" "+ans);
		}
	}
}
