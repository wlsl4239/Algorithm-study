import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n;
	static int[] coin;
	static int[] arr = new int [64001];
	static int impossible = 100000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		coin = new int [n];
		for(int i=0;i<arr.length;i++)
			arr[i] = impossible;
		
		for(int i=0;i<n;i++) {
			coin[i] = sc.nextInt();
			arr[coin[i]] = 1;
		}
		int m = sc.nextInt();
		
		
		for(int i=1;i<=m;i++) {
			for(int j=0;j<n;j++) {
				if(i+coin[j]<=m)
				arr[i+coin[j]] = Math.min(arr[i]+1, arr[i+coin[j]]);
			}
		}
		if(arr[m]==impossible)
			System.out.println("impossible");
		else
			System.out.println(arr[m]);
	}
}

/*
4
14 12 3 3 
21983
*/
