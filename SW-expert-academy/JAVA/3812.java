import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int test=1;test<=t;test++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int n = sc.nextInt();
			
			long [] arrA = new long [n];
			long [] arrB = new long [n];
			long [] arrC = new long [n];
			long [] temp1 = new long [n];
			long [] temp2 = new long [n];
			
			for(int i=0;i<x;i++) arrA[Math.abs(i-a)%n]++;
			for(int i=0;i<y;i++) arrB[Math.abs(i-b)%n]++;
			for(int i=0;i<z;i++) arrC[Math.abs(i-c)%n]++;
			
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					temp1[(i+j)%n] += arrA[i]*arrB[j];
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					temp2[(i+j)%n] += temp1[i]*arrC[j];
			
			System.out.print("#"+test+" ");
			for(int i=0;i<n;i++) System.out.print(temp2[i]+" ");
			System.out.println();
			
		}
	}
}
