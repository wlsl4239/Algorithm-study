/**
 * 종류 : 시뮬레이션
 * 
 * H*W 배틀필드가 주어진다.
 * 다음 표는 게임 맵의 구성 요소를 나타낸다.
 
	문자	의미
	.	평지(전차가 들어갈 수 있다.)
 	*	벽돌로 만들어진 벽
	#	강철로 만들어진 벽
	-	물(전차는 들어갈 수 없다.)
	^	위쪽을 바라보는 전차(아래는 평지이다.)
	v	아래쪽을 바라보는 전차(아래는 평지이다.)
	<	왼쪽을 바라보는 전차(아래는 평지이다.)
	>	오른쪽을 바라보는 전차(아래는 평지이다.)
	
 * 다음 표는 사용자가 넣을 수 있는 입력의 종류를 나타낸다.
 
	문자	동작
	U	Up : 전차가 바라보는 방향을 위쪽으로 바꾸고, 한 칸 위의 칸이 평지라면 위 그 칸으로 이동한다.
	D	Down : 전차가 바라보는 방향을 아래쪽으로 바꾸고, 한 칸 아래의 칸이 평지라면 그 칸으로 이동한다.
	L	Left : 전차가 바라보는 방향을 왼쪽으로 바꾸고, 한 칸 왼쪽의 칸이 평지라면 그 칸으로 이동한다.
	R	Right : 전차가 바라보는 방향을 오른쪽으로 바꾸고, 한 칸 오른쪽의 칸이 평지라면 그 칸으로 이동한다.
	S	Shoot : 전차가 현재 바라보고 있는 방향으로 포탄을 발사한다.
 * 
 *	필드와 문자열이 주어졌을 때, 최종 필드의 상태를 출력하라.
 *
 *
 *	주어진 동작대로 구현하면 된다.	
 * 
 * */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution1873_상호의배틀필드_서울9반_김경수 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		
		for(int test=1;test<=t;test++) {
			String[] s = br.readLine().split(" ");
			int h = Integer.parseInt(s[0]);
			int w = Integer.parseInt(s[1]);
			char[][] arr = new char[h][w];
			int tankx = -1;
			int tanky = -1;
			int tankdir = -1;	//1 : up, 2 : down, 3 : left, 4 : right
			for(int i=0;i<h;i++) {
				String ss = br.readLine();
				for(int j=0;j<w;j++) { 
					arr[i][j] = ss.charAt(j);
					
					if(arr[i][j]=='^') {
						tanky = i;
						tankx = j;
						tankdir = 1;
					}
					else if(arr[i][j]=='v') {
						tanky = i;
						tankx = j;
						tankdir = 2;
					}
					else if(arr[i][j]=='<') {
						tanky = i;
						tankx = j;
						tankdir = 3;
					}
					else if(arr[i][j]=='>') {
						tanky = i;
						tankx = j;
						tankdir = 4;
					}
				}
			}
		
			int n = Integer.parseInt(br.readLine().trim());
			String query = br.readLine();
			
			for(int i=0;i<n;i++) {
				
				switch(query.charAt(i)) {
				case 'U':
					arr[tanky][tankx] = '^';
					tankdir = 1;
					if(tanky>0 && arr[tanky-1][tankx] == '.') {
						arr[tanky-1][tankx] = '^';
						arr[tanky][tankx] = '.';
						tanky--;
					}
					break;
				case 'D':
					arr[tanky][tankx] = 'v';
					tankdir = 2;
					if(tanky<h-1 && arr[tanky+1][tankx] == '.') {
						arr[tanky+1][tankx] = 'v';
						arr[tanky][tankx] = '.';
						tanky++;
					}
					break;
					
				case 'L':
					arr[tanky][tankx] = '<';
					tankdir = 3;
					if(tankx>0 && arr[tanky][tankx-1] == '.') {
						arr[tanky][tankx-1] = '<';
						arr[tanky][tankx] = '.';
						tankx--;
					}
					break;
					
				case 'R':
					arr[tanky][tankx] = '>';
					tankdir = 4;
					if(tankx<w-1 && arr[tanky][tankx+1] == '.') {
						arr[tanky][tankx+1] = '>';
						arr[tanky][tankx] = '.';
						tankx++;
					}
					break;
					
				case 'S':
					switch(tankdir) {
					case 1:
						for(int j=tanky-1;j>=0;j--) {
							if(arr[j][tankx] == '*') {
								arr[j][tankx] = '.';
								break;
							}
							else if(arr[j][tankx] == '#')
								break;
						}
						break;
					case 2:
						for(int j=tanky+1;j<h;j++) {
							if(arr[j][tankx] == '*') {
								arr[j][tankx] = '.';
								break;
							}
							else if(arr[j][tankx] == '#')
								break;
						}
						break;
						
					case 3:
						for(int j=tankx-1;j>=0;j--) {
							if(arr[tanky][j] == '*') {
								arr[tanky][j] = '.';
								break;
							}
							else if(arr[tanky][j] == '#')
								break;
						}
						break;
						
					case 4:
						for(int j=tankx+1;j<w;j++) {
							if(arr[tanky][j] == '*') {
								arr[tanky][j] = '.';
								break;
							}
							else if(arr[tanky][j] == '#')
								break;
						}
						break;
					}
				}
//				System.out.println(i +" : "+ query.charAt(i) + "  TANK x : " + tankx + " y : " + tanky + " dir : " + tankdir);
//				for(char[] a : arr)
//				System.out.println(Arrays.toString(a));
//				System.out.println();
			}
			System.out.print("#"+test+" ");
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++)
					System.out.print(arr[i][j]);
				System.out.println();
				}
			
		}
	}
}
