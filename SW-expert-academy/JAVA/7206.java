/**
  숫자를 xxxyy -> xxx,yy 이런식으로 2분할만 하면 될 줄 알았는데 아니였나보다.
  숫자 n의 범위가 1~99999이기 때문에 자를수 있는 분할은 최대 5분할까지.
  테스트케이스에선 3분할까지만 하면 되는 듯 하다.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	static int ans;
	static void dfs(int num,int turn) {
		if(num<10) {
			ans = Math.max(turn, ans);
			return;
		}
		int k = 10;
		while(true) {
			if(k>num) break;
			int a = num/k;
			int b = num%k;
			int kk = 10;
			while(true) {
				if(kk>b) break;
				int bb = b/kk;
				int cc = b%kk;
				int kkk=10;
				while(true) {
					if(kkk>cc) break;
					int ccc = cc/kkk;
					int ddd = cc%kkk;
					int kkkk = 10;
					while(true) {
						if(kkkk>ddd) break;
						int dddd = ddd/kkkk;
						int eeee = ddd%kkkk;
						kkkk*=10;
						dfs(a*bb*ccc*dddd*eeee,turn+1);		//5분할
					}
					kkk*=10;
					dfs(a*bb*ccc*ddd,turn+1);			//4분할
				}
				kk*=10;
				dfs(a*bb*cc,turn+1);					//3분할
			}			
			k*=10;
			dfs(a*b,turn+1);						//2분할
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		
		for(int test=1;test<=t;test++) {
			int n = Integer.parseInt(br.readLine().trim());
			ans = 0;
			
			dfs(n,0);
			System.out.println("#"+test+" "+ans);
		}
		
	}
}

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	static int ans;
	static void dfs(int num,int turn) {
		if(num<10) {
			ans = Math.max(turn, ans);
			return;
		}		
		int k = 10;
		while(true) {
			if(k>num) break;
			int a = num/k;
			int b = num%k;
			int kk = 10;
			while(true) {
				if(kk>b) break;
				int bb = b/kk;
				int cc = b%kk;
				kk*=10;
				dfs(a*bb*cc,turn+1);
			}			
			k*=10;
			dfs(a*b,turn+1);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		
		for(int test=1;test<=t;test++) {
			int n = Integer.parseInt(br.readLine().trim());
			ans = 0;
			
			dfs(n,0);
			System.out.println("#"+test+" "+ans);
		}
		
	}
}
*/
