import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean ans = true;
		int[][] arr = new int [n+1][n+1];
		
		for(int i=1;i<=n;i++) 
			for(int j=1;j<=n;j++) 
			arr[i][j] = sc.nextInt();
		for(int i=1;i<=n;i++)
			arr[i][i] = 1;
				
		for(int k=1;k<=n;k++) 
			for(int i=1;i<=n;i++) 
				for(int j=1;j<=n;j++)
					if(arr[i][k]==1 && arr[k][j]==1)
						arr[i][j] = 1;
		
		int start = sc.nextInt();		
		for(int i=1;i<m;i++) {
			int end = sc.nextInt();
			if(arr[start][end] == 0) ans = false;				
			start = end;
		}
		
		if(ans)System.out.println("YES");
		else System.out.println("NO");
		
	}
}

