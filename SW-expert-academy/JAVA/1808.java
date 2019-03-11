import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	static int []arr;
	static int dfs(int num) {
		if(arr[num] != 0)
			return arr[num];
		
		int ret = 10000000;
		for(int i=2;i<=Math.sqrt((double)num);i++) {
			if(num%i == 0) {
				ret = Math.min(ret,dfs(num/i) + dfs(i) + 1);				
			}			
		}
		return ret;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		
		for(int test=1;test<=t;test++) {
			int []num = new int[10];
			arr = new int [1000001];
			
			String[] s = br.readLine().split(" ");
			for(int i=0;i<10;i++) 
				num[i] = Integer.parseInt(s[i]);
			int n = Integer.parseInt(br.readLine().trim());
			
			if(num[0]==1) arr[0] = 1;
			if(num[0]==1 && num[1] == 1) arr[1000000] = 7;
			
			for(int a=1;a<10;a++) {
				if(num[a] == 0) continue;
				arr[a] = 1;
				for(int b=0;b<10;b++) {
					if(num[b] == 0) continue;
					arr[a*10+b] = 2;
					for(int c=0;c<10;c++) {
						if(num[c] == 0) continue;
						arr[a*100+b*10+c] = 3;
						for(int d=0;d<10;d++) {
							if(num[d] == 0) continue;
							arr[a*1000+b*100+c*10+d] = 4;
							for(int e=0;e<10;e++) {
								if(num[e] == 0) continue;
								arr[a*10000+b*1000+c*100+d*10+e] = 5;
								for(int f=0;f<10;f++) {
									if(num[f] == 0) continue;
									arr[a*100000+b*10000+c*1000+d*100+e*10+f] = 6;									
								}	
							}	
						}	
					}	
				}
			}
			if(dfs(n) == 10000000) System.out.println("#"+test+" -1");
			else System.out.println("#"+test+" "+(dfs(n) + 1));
			
			
		}
	}
}
