//N Queen Problem

import java.util.Scanner;

public class Main {
	public static int N;
	public static int[] col;
	public static int cnt;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		col = new int[N];

		nqueen(0);
		System.out.println(cnt);

	}

	private static void nqueen(int i) {
		if(i==N) {
			cnt++;
		}
		else {
			for(int j=0;j<N;j++) {
				col[i]=j;
				if(promising(i)) nqueen(i+1);
			}
		}
	}

	private static boolean promising(int i) {
		for(int j=0;j<i;j++) 
			if(col[j] == col[i] || Math.abs(col[i]-col[j]) == (i-j)) 
				return false;

		return true;
	}
}
