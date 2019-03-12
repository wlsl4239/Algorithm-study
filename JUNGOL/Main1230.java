import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    static int n,ans;
    static int[][] arr;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static boolean[][] visited;
     
    static void dfs(int y,int x,int cnt) {
        if(arr[y][x] == 2) cnt++;
        if(x == n-1 && y == n-1) {
            ans = Math.max(ans, cnt);
            return;
        }               
        for(int i=0;i<4;i++) {
            int nexty = y+dy[i];
            int nextx = x+dx[i];
             
            if(nexty>=0 && nexty<n && nextx>=0 && nextx<n && !visited[nexty][nextx] && arr[nexty][nextx] != 1) {
                visited[nexty][nextx] = true;
                dfs(nexty,nextx,cnt);
                visited[nexty][nextx] = false;
            }           
        }   
    }
     
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                 
        n = Integer.parseInt(br.readLine().trim());
        arr = new int [n][n];
        visited = new boolean[n][n];
        ans = 0;
         
        for(int i=0;i<n;i++) {
            String[] s = br.readLine().split(" ");
            for(int j=0;j<n;j++) {
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }
        visited[0][0] = true;
        dfs(0,0,0);
        System.out.println(ans);
    }
}
