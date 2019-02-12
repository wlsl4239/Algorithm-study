package brutegreedy;

import java.util.Scanner;

public class Main1335 {
	static int blue;
	static int white;
	static int[][] arr;
	
	static boolean isBlue(int y,int x, int size) {
		for(int i=y;i<y+size;i++) 
			for(int j=x;j<x+size;j++) 
				if(arr[i][j] == 0)	return false;
				
		return true;
	}
	static boolean isWhite(int y,int x, int size) {
		for(int i=y;i<y+size;i++) 
			for(int j=x;j<x+size;j++) 
				if(arr[i][j] == 1)	return false;
				
		return true;
	}
	
	static void func(int y,int x,int size) {
		if(isBlue(y,x,size)) {
			blue++;
			return;
		}
		if(isWhite(y,x,size)) {
			white++;
			return;
		}
		
		func(y,x,size/2);
		func(y+size/2,x,size/2);
		func(y,x+size/2,size/2);
		func(y+size/2,x+size/2,size/2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 arr = new int[n][n];
		
		for(int i=0;i<n;i++) 
			for(int j=0;j<n;j++)
				arr[i][j] = sc.nextInt();
		
		func(0,0,n);
//		System.out.println(isBlue(0,0,n));
		System.out.println(white+"\n"+blue);
		
	}
}
