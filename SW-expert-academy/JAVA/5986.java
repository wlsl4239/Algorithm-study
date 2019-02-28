/**
 * 5이상의 홀수는 3개의 소수의 합으로 나타낼 수 있다.
 * 5이상의 홀수가 주어졌을 때, 소수의 합으로 나타낼 수 있는 경우의 수를 출력하라.
 * 
 * 에라토스테네스의체를 이용해서 소수를 구한 뒤 
 * 3중 for문을 이용해 각 숫자들에 대해 경우의수를 증가시켜간다.
 * 그 후 입력받은 n에 대해 sumof3prime[n]을 출력한다.
 * 
 * */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Solution5986_새샘이와세소수_서울9반_김경수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int [] sumof3prime = new int [3000];
		boolean [] notPrime = new boolean [1000];
		ArrayList<Integer> prime = new ArrayList<>();
		notPrime[0] = true;
		notPrime[1] = true;
		for(int i=2;i<Math.sqrt(notPrime.length);i++) {
			if(notPrime[i]) continue;
			for(int j=i+i;j<notPrime.length;j+=i)
				notPrime[j] = true;
		}
		for(int i=0;i<1000;i++)
			if(!notPrime[i]) prime.add(i);
		
		for(int i=0;i<prime.size();i++) 
			for(int j=i;j<prime.size();j++)
				for(int k=j;k<prime.size();k++)
					sumof3prime[prime.get(i)+prime.get(j)+prime.get(k)]++;
		
		
		int t = Integer.parseInt(br.readLine().trim());
		for(int test=1;test<=t;test++) {
			int n = Integer.parseInt(br.readLine().trim());
			bw.write("#"+test+" "+sumof3prime[n]+"\n");
			bw.flush();
//			System.out.println("#"+test+" "+sumof3prime[n]);
		}
	}
}
