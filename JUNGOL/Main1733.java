import java.util.Arrays;
import java.util.Scanner;

/*
입력으로 19*19의 바둑판의 상태가 주어진다. (흰색이 이기거나, 검은색이 이기거나, 아직 결정되지 않은 상태)
검은색 : 1
흰색 : 2
빈칸 : 0
6목은 이긴상태가 아님.

누가 이겼는지, 가장 왼쪽 위가 뭔지 출력.
 */
public class Main수 {
	public static void main(String[] args) {
		int[][] arr = new int [30][30];
		
		int[][] blackWin = {{0,1,1,1,1,1,0}, {2,1,1,1,1,1,0}, {0,1,1,1,1,1,2}, {2,1,1,1,1,1,2}};
		int[][] whiteWin = {{0,2,2,2,2,2,0}, {1,2,2,2,2,2,0}, {0,2,2,2,2,2,1}, {1,2,2,2,2,2,1}};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=19;i++) 	for(int j=1;j<=19;j++)
			arr[i][j] = sc.nextInt();
		
		int ans = 0;
		int y = -1;
		int x = -1;
		
		loop: for(int i=0;i<=19;i++) {
			for(int j=0;j<=19;j++) {		// (i,j)에서 시작하는 list가 blackWin[k]와 일치하는지.
				for(int k=0;k<blackWin.length;k++) {
					boolean flagw = true;
					boolean flagh = true;
					boolean flagcd = true;
					for(int l=0;l<blackWin[k].length;l++) {	//가로 비교
						if(arr[i][j+l] != blackWin[k][l]) {
							flagw = false;
							break;
						}
					}
					for(int l=0;l<blackWin[k].length;l++) {	//세로 비교
						if(arr[i+l][j] != blackWin[k][l]) {
							flagh = false;
							break;
						}
					}
					for(int l=0;l<blackWin[k].length;l++) {	//대각선 비교
						if(arr[i+l][j+l] != blackWin[k][l]) {
							flagcd = false;
							break;
						}
					}
					if(flagw) {
						ans = 1;
						y = i;
						x = j+1;
						break loop;
					}
					else if(flagh) {
						ans = 1;
						y = i+1;
						x = j;
						break loop;
					}
					else if(flagcd) {
						ans = 1;
						y = i+1;
						x = j+1;
						break loop;
					}
					if(i>=7) {
						boolean flagcu = true;
						for(int l=0;l<blackWin[k].length;l++) {	//대각선 비교
							if(i-l>=0 && arr[i-l][j+l] != blackWin[k][l]) {
								flagcu = false;
								break;
							}
						}
						if(flagcu) {
							ans = 1;
							y = i-1;
							x = j+1;
							break loop;
						}
					}
					
				}
			}
		}
		
		loop: for(int i=0;i<=19;i++) {
			for(int j=0;j<=19;j++) {		// (i,j)에서 시작하는 list가 whiteWin[k]와 일치하는지.
				for(int k=0;k<whiteWin.length;k++) {
					boolean flagw = true;
					boolean flagh = true;
					boolean flagcd = true;
					for(int l=0;l<whiteWin[k].length;l++) {	//가로 비교
						if(arr[i][j+l] != whiteWin[k][l]) {
							flagw = false;
							break;
						}
					}
					for(int l=0;l<whiteWin[k].length;l++) {	//세로 비교
						if(arr[i+l][j] != whiteWin[k][l]) {
							flagh = false;
							break;
						}
					}
					for(int l=0;l<whiteWin[k].length;l++) {	//대각선 비교
						if(arr[i+l][j+l] != whiteWin[k][l]) {
							flagcd = false;
							break;
						}
					}
					if(flagw) {
						ans = 2;
						y = i;
						x = j+1;
						break loop;
					}
					else if(flagh) {
						ans = 2;
						y = i+1;
						x = j;
						break loop;
					}
					else if(flagcd) {
						ans = 2;
						y = i+1;
						x = j+1;
						break loop;
					}
					

					if(i>=7) {
						boolean flagcu = true;
						for(int l=0;l<whiteWin[k].length;l++) {	//대각선 비교
							if(i-l>=0 && arr[i-l][j+l] != whiteWin[k][l]) {
								flagcu = false;
								break;
							}
						}
						if(flagcu) {
							ans = 2;
							y = i-1;
							x = j+1;
							break loop;
						}
					}
				}
			}
		}
		
		System.out.println(ans);
		if(ans!=0) System.out.println((y)+" "+(x));
	}
}
