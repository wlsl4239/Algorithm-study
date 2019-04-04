import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
/*
문자	수행 명령
<	이동 방향을 왼쪽으로 바꾼다.
>	이동 방향을 오른쪽으로 바꾼다.
^	이동 방향을 위쪽으로 바꾼다.
v	이동 방향을 아래쪽으로 바꾼다.
_	메모리에 0이 저장되어 있으면 이동 방향을 오른쪽으로 바꾸고, 아니면 왼쪽으로 바꾼다.
|	메모리에 0이 저장되어 있으면 이동 방향을 아래쪽으로 바꾸고, 아니면 위쪽으로 바꾼다.
?	이동 방향을 상하좌우 중 하나로 무작위로 바꾼다. 방향이 바뀔 확률은 네 방향 동일하다.
.	아무 것도 하지 않는다.
@	프로그램의 실행을 정지한다.
0~9	메모리에 문자가 나타내는 값을 저장한다.
+	메모리에 저장된 값에 1을 더한다. 만약 더하기 전 값이 15이라면 0으로 바꾼다.
-	메모리에 저장된 값에 1을 뺀다. 만약 빼기 전 값이 0이라면 15로 바꾼다.
 */
public class Solution {
	static int[] dx = {1,-1,0,0};//0 : 우 1 : 좌 2 : 하 3 : 상
	static int[] dy = {0,0,1,-1};//0 : 우 1 : 좌 2 : 하 3 : 상
	
	static class Node{
		int y,x,mem,dir;

		Node(int y, int x, int dir,int mem) {
			this.y = y;
			this.x = x;
			this.mem = mem;
			this.dir = dir;
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine().trim());

		for(int test=1;test<=t;test++) {
			
			String[] s = br.readLine().split(" ");
			int r = Integer.parseInt(s[0]);
			int c = Integer.parseInt(s[1]);
			char[][] arr = new char[r][c];
			boolean isEnd = false;
			int cnt = 0;
			
			
			for(int i=0;i<r;i++) {
				String ss = br.readLine();
				for(int j=0;j<c;j++) {
					arr[i][j] = ss.charAt(j);
					if(arr[i][j] == '@') isEnd = true;
				}
			}
			
			if(!isEnd) {
				System.out.println("#"+test+" NO");
				continue;
			}
			
			
			Queue<Node> q = new LinkedList<>();
			boolean[][][][] visited = new boolean[r][c][4][32];
			
			q.add(new Node(0,0,0,0));
			visited[0][0][0][0] = true;
			
			boolean flag = false;
			lb:while(!q.isEmpty()) {
				Node now = q.poll();
				visited[now.y][now.x][now.dir][now.mem] = true;
				
				switch(arr[now.y][now.x]) {
				case '<':
					if(now.x==0) {
						if(visited[now.y][now.x][1][now.mem]) {
							flag = true;
							break lb;
						}							
						q.add(new Node(now.y,now.x,1,now.mem));
					}
					else {
						if(visited[now.y][now.x-1][1][now.mem]) {
							flag = true;
							break lb;
						}							
						q.add(new Node(now.y,now.x-1,1,now.mem));
					}
					break;
				case '>':
					if(now.x==c-1) {
						if(visited[now.y][now.x][0][now.mem]) {
							flag = true;
							break lb;
						}							
						q.add(new Node(now.y,now.x,0,now.mem));
					}
					else {
						if(visited[now.y][now.x+1][0][now.mem]) {
							flag = true;
							break lb;
						}							
						q.add(new Node(now.y,now.x+1,0,now.mem));
					}
					break;
				case '^':
					if(now.y==0) {
						if(visited[now.y][now.x][3][now.mem]) {
							flag = true;
							break lb;
						}							
						q.add(new Node(now.y,now.x,3,now.mem));
					}
					else {
						if(visited[now.y-1][now.x][3][now.mem]) {
							flag = true;
							break lb;
						}							
						q.add(new Node(now.y-1,now.x,3,now.mem));
					}
					break;
				case 'v':
					if(now.y==r-1) {
						if(visited[now.y][now.x][2][now.mem]) {
							flag = true;
							break lb;
						}							
						q.add(new Node(now.y,now.x,2,now.mem));
					}
					else {
						if(visited[now.y+1][now.x][2][now.mem]) {
							flag = true;
							break lb;
						}							
						q.add(new Node(now.y+1,now.x,2,now.mem));
					}
					break;
				case '_':
					if(now.mem == 0) {
						if(now.x==c-1) {
							if(visited[now.y][now.x][0][now.mem]) {
								flag = true;
								break lb;
							}							
							q.add(new Node(now.y,now.x,0,now.mem));
						}
						else {
							if(visited[now.y][now.x+1][0][now.mem]) {
								flag = true;
								break lb;
							}							
							q.add(new Node(now.y,now.x+1,0,now.mem));
						}						
					}
					else {
						if(now.x==0) {
							if(visited[now.y][now.x][1][now.mem]) {
								flag = true;
								break lb;
							}							
							q.add(new Node(now.y,now.x,1,now.mem));
						}
						else {
							if(visited[now.y][now.x-1][1][now.mem]) {
								flag = true;
								break lb;
							}							
							q.add(new Node(now.y,now.x-1,1,now.mem));
						}
					}
					break;
				case '|':
					if(now.mem == 0) {
						if(now.y==r-1) {
							if(visited[now.y][now.x][2][now.mem]) {
								flag = true;
								break lb;
							}							
							q.add(new Node(now.y,now.x,2,now.mem));
						}
						else {
							if(visited[now.y+1][now.x][2][now.mem]) {
								flag = true;
								break lb;
							}							
							q.add(new Node(now.y+1,now.x,2,now.mem));
						}
					}
					else {
						if(now.y==0) {
							if(visited[now.y][now.x][3][now.mem]) {
								flag = true;
								break lb;
							}							
							q.add(new Node(now.y,now.x,3,now.mem));
						}
						else {
							if(visited[now.y-1][now.x][3][now.mem]) {
								flag = true;
								break lb;
							}							
							q.add(new Node(now.y-1,now.x,3,now.mem));
						}
					}
					break;
				case '?':
					cnt++;
					if(cnt>60) {
						flag = true;
						break lb;
					}
					if(now.x!=0){
						if(visited[now.y][now.x-1][1][now.mem]) {
							flag = true;
							break ;
						}							
						q.add(new Node(now.y,now.x-1,1,now.mem));
					}
					if(now.x!=c-1){
						if(visited[now.y][now.x+1][0][now.mem]) {
							flag = true;
							break ;
						}							
						q.add(new Node(now.y,now.x+1,0,now.mem));
					}
					if(now.y!=0){
						if(visited[now.y-1][now.x][3][now.mem]) {
							flag = true;
							break ;
						}							
						q.add(new Node(now.y-1,now.x,3,now.mem));
					}
					if(now.y!=r-1){
						if(visited[now.y+1][now.x][2][now.mem]) {
							flag = true;
							break ;
						}							
						q.add(new Node(now.y+1,now.x,2,now.mem));
					}
					
					break;
				case '.':
					if(now.y+dy[now.dir]<0 || now.y+dy[now.dir]>=r || now.x+dx[now.dir]<0 || now.x+dx[now.dir]>=c) {
						break;
					}
					if(visited[now.y+dy[now.dir]][now.x+dx[now.dir]][now.dir][now.mem]) {
						flag = true;
						break lb;
					}
					q.add(new Node(now.y+dy[now.dir],now.x+dx[now.dir],now.dir,now.mem));
					break;
				case '@':
					flag = false;
					break lb;
				case '+':
					if(now.y+dy[now.dir]<0 || now.y+dy[now.dir]>=r || now.x+dx[now.dir]<0 || now.x+dx[now.dir]>=c) {
						break;
					}
					if(visited[now.y+dy[now.dir]][now.x+dx[now.dir]][now.dir][(now.mem+1)%16]) {
						flag = true;
						break lb;
					}
					q.add(new Node(now.y+dy[now.dir],now.x+dx[now.dir],now.dir,(now.mem+1)%16));
					break;
				case '-':
					if(now.y+dy[now.dir]<0 || now.y+dy[now.dir]>=r || now.x+dx[now.dir]<0 || now.x+dx[now.dir]>=c) {
						break;
					}
					if(visited[now.y+dy[now.dir]][now.x+dx[now.dir]][now.dir][(now.mem+15)%16]) {
						flag = true;
						break lb;
					}
					q.add(new Node(now.y+dy[now.dir],now.x+dx[now.dir],now.dir,(now.mem+15)%16));
					break;
				case '0':
					if(now.y+dy[now.dir]<0 || now.y+dy[now.dir]>=r || now.x+dx[now.dir]<0 || now.x+dx[now.dir]>=c) {
						break;
					}
					if(visited[now.y+dy[now.dir]][now.x+dx[now.dir]][now.dir][0]) {
						flag = true;
						break lb;
					}
					q.add(new Node(now.y+dy[now.dir],now.x+dx[now.dir],now.dir,0));
					break;
				case '1':
					if(now.y+dy[now.dir]<0 || now.y+dy[now.dir]>=r || now.x+dx[now.dir]<0 || now.x+dx[now.dir]>=c) {
						break;
					}
					if(visited[now.y+dy[now.dir]][now.x+dx[now.dir]][now.dir][1]) {
						flag = true;
						break lb;
					}
					q.add(new Node(now.y+dy[now.dir],now.x+dx[now.dir],now.dir,1));
					break;
				case '2':
					if(now.y+dy[now.dir]<0 || now.y+dy[now.dir]>=r || now.x+dx[now.dir]<0 || now.x+dx[now.dir]>=c) {
						break;
					}
					if(visited[now.y+dy[now.dir]][now.x+dx[now.dir]][now.dir][2]) {
						flag = true;
						break lb;
					}
					q.add(new Node(now.y+dy[now.dir],now.x+dx[now.dir],now.dir,2));
					break;
				case '3':
					if(now.y+dy[now.dir]<0 || now.y+dy[now.dir]>=r || now.x+dx[now.dir]<0 || now.x+dx[now.dir]>=c) {
						break;
					}
					if(visited[now.y+dy[now.dir]][now.x+dx[now.dir]][now.dir][3]) {
						flag = true;
						break lb;
					}
					q.add(new Node(now.y+dy[now.dir],now.x+dx[now.dir],now.dir,3));
					break;
				case '4':
					if(now.y+dy[now.dir]<0 || now.y+dy[now.dir]>=r || now.x+dx[now.dir]<0 || now.x+dx[now.dir]>=c) {
						break;
					}
					if(visited[now.y+dy[now.dir]][now.x+dx[now.dir]][now.dir][4]) {
						flag = true;
						break lb;
					}
					q.add(new Node(now.y+dy[now.dir],now.x+dx[now.dir],now.dir,4));
					break;
				case '5':
					if(now.y+dy[now.dir]<0 || now.y+dy[now.dir]>=r || now.x+dx[now.dir]<0 || now.x+dx[now.dir]>=c) {
						break;
					}
					if(visited[now.y+dy[now.dir]][now.x+dx[now.dir]][now.dir][5]) {
						flag = true;
						break lb;
					}
					q.add(new Node(now.y+dy[now.dir],now.x+dx[now.dir],now.dir,5));
					break;
				case '6':
					if(now.y+dy[now.dir]<0 || now.y+dy[now.dir]>=r || now.x+dx[now.dir]<0 || now.x+dx[now.dir]>=c) {
						break;
					}
					if(visited[now.y+dy[now.dir]][now.x+dx[now.dir]][now.dir][6]) {
						flag = true;
						break lb;
					}
					q.add(new Node(now.y+dy[now.dir],now.x+dx[now.dir],now.dir,6));
					break;
				case '7':
					if(now.y+dy[now.dir]<0 || now.y+dy[now.dir]>=r || now.x+dx[now.dir]<0 || now.x+dx[now.dir]>=c) {
						break;
					}
					if(visited[now.y+dy[now.dir]][now.x+dx[now.dir]][now.dir][7]) {
						flag = true;
						break lb;
					}
					q.add(new Node(now.y+dy[now.dir],now.x+dx[now.dir],now.dir,7));
					break;
				case '8':
					if(now.y+dy[now.dir]<0 || now.y+dy[now.dir]>=r || now.x+dx[now.dir]<0 || now.x+dx[now.dir]>=c) {
						break;
					}
					if(visited[now.y+dy[now.dir]][now.x+dx[now.dir]][now.dir][8]) {
						flag = true;
						break lb;
					}
					q.add(new Node(now.y+dy[now.dir],now.x+dx[now.dir],now.dir,8));
					break;
				case '9':
					if(now.y+dy[now.dir]<0 || now.y+dy[now.dir]>=r || now.x+dx[now.dir]<0 || now.x+dx[now.dir]>=c) {
						break;
					}
					if(visited[now.y+dy[now.dir]][now.x+dx[now.dir]][now.dir][9]) {
						flag = true;
						break lb;
					}
					q.add(new Node(now.y+dy[now.dir],now.x+dx[now.dir],now.dir,9));
					break;
				}
			}
			
			if(flag) System.out.println("#"+test+" NO");
			else System.out.println("#"+test+" YES");	
		}
	}
}
