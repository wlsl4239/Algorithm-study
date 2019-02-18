//findSet에서 return arr[v]=findSet(arr[v]); 해주자. root를 갱신시켜줘서 시간을 줄일수 있다.

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	static int n,m;
	static int[] arr;
	
	static int findSet(int v) {
		if(arr[v]<0)return v;
		return arr[v] = findSet(arr[v]);
	}
	static int isSameRoot(int a,int b) {
		return findSet(a) == findSet(b) ? 1 : 0;
	}
	static void unionSet(int a,int b) {
		if(a<b) {
			int temp=a;a=b;b=temp;
		}
		int root1 = findSet(a);
		int root2 = findSet(b);
		if(root1 == root2) return;
		
		arr[root1] = arr[root2];
		arr[root2] = root1;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int test=1;test<=t;test++) {
			n = sc.nextInt();
			m = sc.nextInt();
			arr = new int[n+1];
			for(int i=1;i<n+1;i++)
				arr[i] = -1;
			
			System.out.print("#"+test+" ");
			for(int i=0;i<m;i++) {
				int query = sc.nextInt();
				int a = sc.nextInt();
				int b = sc.nextInt();
				switch(query) {
				case 0:
					unionSet(a,b);
					break;
				case 1:
					System.out.print(isSameRoot(a,b));
					break;
				}				
			}
			System.out.println();
		}
	}
}
