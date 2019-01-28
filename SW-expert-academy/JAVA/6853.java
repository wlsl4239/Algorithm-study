import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int test = 1;test<=t;test++) {
			int inner = 0;
			int onLine = 0;
			int outer = 0;
			
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int n = sc.nextInt();
			
			for(int i=0;i<n;i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				if((x1<x && x<x2) && (y1<y && y<y2))
					inner++;
				else if((x==x1 && (y1<=y && y<=y2)) || 
						(x==x2 && (y1<=y && y<=y2)) || 
						(y==y1 && (x1<=x && x<=x2)) || 
						(y==y2 && (x1<=x && x<=x2) )) {
					onLine++;
				}
				else {
					outer++;
				}
			}
			
			System.out.println("#"+test+" "+inner+" "+onLine+" "+outer);
		}
		
	}
}
