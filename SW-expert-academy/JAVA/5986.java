import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
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
			System.out.println("#"+test+" "+sumof3prime[n]);
		}
	}
}
