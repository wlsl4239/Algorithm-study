import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {

	public static boolean isOK(int x,int y) {
		return !(x<0 || y < 0 || x >=100 || y >=100);
	}

	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		int T;		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			T=sc.nextInt();
			int [][]arr = new int [100][100];
			int ansstart = -1;

			for(int i=0;i<100;i++)
				for(int j=0;j<100;j++) {
					arr[i][j] = sc.nextInt();
				}			

			int ans = 10001;
			for(int i=0;i<100;i++) {
				if(arr[0][i] == 0) {
					continue;
				}				
				boolean [][] visited = new boolean[100][100];
				int nowx = i;
				int nowy = 0;
				
				int cnt = 0;
				while(true) {
					if(nowy == 99){
						if(ans>cnt) {
							ans = cnt;
							ansstart = i;
						}
						break;
					}

					visited[nowy][nowx] = true;
					cnt++;
					if(isOK(nowx+1,nowy) && arr[nowy][nowx+1] == 1 && !visited[nowy][nowx+1]) 
						nowx++;
					else if(isOK(nowx-1,nowy) && arr[nowy][nowx-1] == 1 && !visited[nowy][nowx-1]) 
						nowx--;
					else
						nowy++;
				}
			}
			System.out.println("#"+test_case+" "+ansstart);
		}
	}
}
