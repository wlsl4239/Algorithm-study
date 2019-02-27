/**
 * 문제 분류 : greedy
 * 
 * https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWczm7QaACgDFAWn&categoryId=AWczm7QaACgDFAWn&categoryType=CODE
 *  
 * 1~5000번 까지의 버스 정류장이 있다.
 * 각 테스트케이스에서 n개 줄에 걸쳐 Ai Bi가 주어지는데, 이는 i번째 버스의 출발점과 종점이다. (Ai ~ Bi, 1씩 증가)
 * 그 후 p개 줄에 걸쳐 Cj가 주어지고 Cj번째 정류장을 지나는 버스의 대수를 출력하라.
 * (1<=n<=500, 1<=Ai<=Bi<=5000, 1<=p<=500)
 * 
 * Ai, Bi를 입력 받은 후 busstop[i] (Ai <= i <= Bi, 1씩증가)를 1씩 증가시킨다.
 * 그 후 p줄에 걸쳐 입력받은 Cj에 대해 busstop[Cj]를 출력한다.
 * 
 * */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution6485_삼성시의버스노선_서울9반_김경수 {

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
