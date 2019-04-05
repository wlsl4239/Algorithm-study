import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int test=1;test<=t;test++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			int[] remainder = new int [100001];
			StringBuilder output = new StringBuilder("");
			boolean isCycle = false;
			int w = 0;
			int start = 0;
			int cur = p;
			int first = 0;
			
			while (cur!=0) {
				if (w == 0) {
					w++;
					first = cur / q;
					if(cur % q != 0) 
						output.append('.');
				}
				else {
					output.append((char)((cur / q) + '0'));
					w++;
				}
				
				cur = cur % q;
				if (remainder[cur] != 0) {
					isCycle = true;
					start = remainder[cur];
					break;
				}

				remainder[cur] = w;
				cur *= 10;		
			}

			System.out.print("#"+test+" "+first);
			
			if (isCycle) {
				for (int i = 0; i < w; ++i) {
					if (i == start) {
						System.out.print("("); 						
						System.out.print(output.substring(start));						
						System.out.print(")");
						break;
					}
					else System.out.print(output.charAt(i));
					
				}
			}
			else 
				System.out.print(output.toString());
			System.out.print("\n");
		}
	}
}
