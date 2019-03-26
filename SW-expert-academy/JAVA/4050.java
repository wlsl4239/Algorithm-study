import java.util.Arrays;
import java.util.Scanner;

//4050_재관이의대량할인
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int ans = 0;
		int[] cost = new int[n];
		for(int i=0;i<n;i++) cost[i] = sc.nextInt();
		
		Arrays.sort(cost);
		int cnt = 0;
		for(int i=cost.length-1;i>=0;i--) {
			cnt++;
			if(cnt==3) {
				cnt = 0;
				continue;
			}
			
			ans+=cost[i];
		}
		System.out.println(ans);
		
	}
}
