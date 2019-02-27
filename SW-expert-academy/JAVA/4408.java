/**
 * https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWNcJ2sapZMDFAV8&categoryId=AWNcJ2sapZMDFAV8&categoryType=CODE
 * 
 * 출발, 도착 지점을 a, b라고 했을 때 1에서 출발하나 2에서 출발하나 복도 시작점은 같기 때문에 a, b가 홀수인지 짝수인지는 중요하지 않다. 
 * 그래서 출발, 도착 지점을 입력받고 짝수로 변환시켜준 뒤 
 * corridor 배열에 출발점/2 ~ 도착점/2 까지 +1을 해준 후 최종적으로 배열 내 최댓값을 출력하면 된다.
 * */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4408_자기방으로돌아가기_서울9반_김경수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		
		for(int test=1;test<=t;test++) {
			int n = Integer.parseInt(br.readLine().trim());
			int ans = 0;
			int[] corri = new int[201];
			for(int i=0;i<n;i++) {
				String[] s = br.readLine().split(" ");
				int a = Integer.parseInt(s[0].trim());
				int b = Integer.parseInt(s[1].trim());
				if(a%2==1) a++;
				if(b%2==1) b++;
				if(a>b) {
					int temp=a;
					a=b;
					b=temp;
				}
				for(int j=a/2;j<=b/2;j++) 
					corri[j]++;
			}
			
			for(int i=1;i<corri.length;i++)
				ans = Math.max(ans,corri[i]);
			
			System.out.println("#"+test+" "+ans);
			
		}
	}
}

/*
3    
4    
10 20  
30 40
50 60
70 80
2
1 3
2 200
3
10 100
20 80
30 50
*/
