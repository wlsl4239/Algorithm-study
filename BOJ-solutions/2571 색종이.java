import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static int [][] arr;
	
	static int square(int x1,int x2,int y1,int y2) {
		int sum = 0;		
		for(int i=y1;i<y2;i++) {
			for(int j=x1;j<x2;j++) {
				if(arr[i][j] == 0) return 0;
				sum++;
			}
		}		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer> yy = new HashSet<>();
		HashSet<Integer> xx = new HashSet<>();
		
		int n = sc.nextInt();
		arr = new int [101][101];
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			xx.add(a);
			xx.add(a+10);
			yy.add(b);
			yy.add(b+10);
				
			for(int j=b;j<b+10;j++) 
				for(int k=a;k<a+10;k++)
					arr[j][k] = 1;
		}

		ArrayList<Integer> y = new ArrayList(Arrays.asList(yy.toArray()));
		ArrayList<Integer> x = new ArrayList(Arrays.asList(xx.toArray()));
		
		Collections.sort(y);
		Collections.sort(x);
				
		int ans = 0;
		for(int i=0;i<y.size();i++) 
			for(int j=i+1;j<y.size();j++) 
				for(int k=0;k<x.size();k++) 
					for(int l=k+1;l<x.size();l++)
							ans = Math.max(ans, square(x.get(k),x.get(l),y.get(i),y.get(j)));
					
				
		System.out.println(ans);
	}
}
