import java.util.Scanner;

public class Solution {
	public static int[] left = new int[1001];
	public static int[] right = new int[1001];
	public static String[] val = new String[1001];
	public static int ans;
	public static void postorder(int now) {		
		if(now == -1)
			return;
		postorder(left[now]);
		postorder(right[now]);

		if(val[now].equals("+") || val[now].equals("-") || val[now].equals("*") || val[now].equals("/")) {
			if(right[now] == -1)
				ans = 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int t=1;t<=10;t++) {
			ans = 1;
			for(int i=0;i<1001;i++) {
				left[i] = -1;
				right[i] = -1;
				val[i] = "";
			}
			int n = Integer.parseInt(sc.nextLine());

			for(int i=0;i<n;i++) {
				String[] sa = sc.nextLine().split(" ");
				int idx = Integer.parseInt(sa[0]);
				
				val[idx] = sa[1];
				
				if(sa.length>=3) {
					left[idx] = Integer.parseInt(sa[2]);
				}
				
				if(sa.length==4) {
					right[idx] = Integer.parseInt(sa[3]);
				}
			}
			
			postorder(1);
			System.out.print("#" + t + " " + ans);
			System.out.println();
		}
	}
}	
