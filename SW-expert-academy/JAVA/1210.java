package array2;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution1210_Ladder1_서울9반_김경수 {
	public static int ans;
	public static int [][] arr;
	public static boolean [][] visited;

	public static boolean isOK(int x,int y) {
		return !(x<0 || y < 0 || x >=100 || y >=100);
	}
	
	public static void main(String args[]) throws Exception	{
		System.setIn(new FileInputStream("res/input1210.txt"));
		Scanner sc = new Scanner(System.in);
		int T;		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			T=sc.nextInt();
			arr = new int [100][100];
			visited = new boolean[100][100];
			ans = 0;
			int disty = -1;
			int distx = -1;
			
			for(int i=0;i<100;i++)
				for(int j=0;j<100;j++) {
					arr[i][j] = sc.nextInt();
					if(arr[i][j] == 2) {
						disty = i;
						distx = j;
					}
				}			
			int nowx = distx;
			int nowy = disty;
			
			while(true) {
				if(nowy == 0){
					ans = nowx;
					break;
				}
				
				visited[nowy][nowx] = true;
				
				if(isOK(nowx+1,nowy) && arr[nowy][nowx+1] == 1 && !visited[nowy][nowx+1]) 
					nowx++;
				else if(isOK(nowx-1,nowy) && arr[nowy][nowx-1] == 1 && !visited[nowy][nowx-1]) 
					nowx--;
				else
					nowy--;
			}
			System.out.println("#"+test_case+" "+ans);
		}
	}
}
