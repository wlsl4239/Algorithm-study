import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static int[][] maze;
	public static int n = 100;    //1226번은 16
	public static int[] di = {0,1,0,-1};
	public static int[] dj = {1,0,-1,0};
	public static boolean ans;

	public static int starti = -1,startj = -1,desti = -1,destj = -1;
	
	private static void solver(int i, int j) {
		if(i==desti && j==destj) {
			ans = true;
			return;
		}
        for(int d=0;d<4;d++) {
			int ii = i+di[d];
			int jj = j+dj[d];

			if((ii >= 0 && ii < n) && (jj < n && jj >= 0) && (maze[ii][jj] == 0 || maze[ii][jj] == 3)) {
				maze[ii][jj] = maze[i][j]-1;
				solver(ii,jj);		
			}
		}	
	}

	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			ans = false;
			starti = -1;
			startj = -1;
			desti = -1;
			destj = -1;
			maze = new int[n][n];
			maze[0][0] = -1;
			int t = sc.nextInt();

			for(int i=0;i<n;i++) {
				String query = sc.next();

				for(int j=0;j<n;j++) {
					maze[i][j] = query.charAt(j)-'0';
					if(maze[i][j] == 2) {
						starti = i;
						startj = j;
					}
					if(maze[i][j] == 3) {
						desti = i;
						destj = j;
					}
				}
			}
			solver(starti,startj);
			System.out.print("#" + test_case+" ");
			if(ans)
				System.out.println("1");
			else
				System.out.println("0");
		}
	}
}
