
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		
		for(int test=1;test<=t;test++) {
			int n = Integer.parseInt(br.readLine().trim());
			int[] busstop=new int[5001];
			
			for(int i=0;i<n;i++) {
				String[] s = br.readLine().split(" ");
				int a = Integer.parseInt(s[0].trim());
				int b = Integer.parseInt(s[1].trim());
				
				for(int j=a;j<=b;j++) busstop[j] ++;
			}
			
			System.out.print("#"+test+" ");
			int p = Integer.parseInt(br.readLine().trim());
			
			for(int i=0;i<p;i++) {
				int c = Integer.parseInt(br.readLine().trim());
				System.out.print(busstop[c]+" ");
			}
			System.out.println();
		}
		br.close();
	}
}
