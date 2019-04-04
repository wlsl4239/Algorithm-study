import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t= Integer.parseInt(br.readLine().trim());
		
		for(int test=1;test<=t;test++) {
			String[] s = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			ArrayList<Long> arr = new ArrayList<>();
			
			arr.add(Long.parseLong(s[1]));
			long sum = 0;
			for(int i=0;i<n;i++) {
				s = br.readLine().split(" ");
				arr.add(Long.parseLong(s[0]));
				arr.add(Long.parseLong(s[1]));
				Collections.sort(arr);
				sum += arr.get(arr.size()/2);
				sum %= 20171109;
			}
			System.out.println("#"+test+" "+sum);
		}
	}
}
