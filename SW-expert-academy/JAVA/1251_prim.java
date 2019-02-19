import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	static long[][] map;
	static long[] Weight;
	static int n;
	
	static long prim() {
		for(int i=0;i<n;i++) 
			Weight[i] = -1;
		Weight[0] = 0;
		
		for(int k=1;k<n;k++) {
			long minWeight=Long.MAX_VALUE;
			int minVertex = 0;
			for(int i=0;i<n;i++) {
				if(Weight[i]<0) continue;	//그래프에 포함된경우 skip
				for(int j=0;j<n;j++) {
					if(Weight[j]>=0) continue;	//이미 선택된경우 사이클이 발생됨. skip
					if(map[i][j] < minWeight) {
						minVertex=j;
						minWeight=map[i][j];
					}
				}
			}
			Weight[minVertex] = minWeight;
		}
		long sumCost = 0;
		for(int i=0;i<n;i++) sumCost+=Weight[i];
		return sumCost;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);

		long t=sc.nextInt();
		for(int test=1;test<=t;test++) {
			n = sc.nextInt();
			Weight = new long[n];
			map = new long[n][n];
			long[] x = new long[n];
			long[] y = new long[n];
			
			for(int i=0;i<n;i++)
				x[i]=sc.nextInt();
			for(int i=0;i<n;i++)
				y[i]=sc.nextInt();
			double e = sc.nextDouble();
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(map[i][j]!=0 || i==j) 
						continue;
					map[i][j] = (((x[j]-x[i])*(x[j]-x[i])+(y[j]-y[i])*(y[j]-y[i])));
					map[j][i] = (((x[j]-x[i])*(x[j]-x[i])+(y[j]-y[i])*(y[j]-y[i])));
				}
			}
			
			System.out.format("#%d %.0f\n",test,(double)(e*prim()));
			
		}
	}
}
