import java.util.Scanner;

public class Solution {
	public static int[] parent = new int[1001];
	public static int[] left = new int[1001];
	public static int[] right = new int[1001];
	public static String[] val = new String[1001];
	public static int n;

	public static void postorder(int now) {		
		if(now == -1)
			return;
		postorder(left[now]);
		postorder(right[now]);

		if(val[now].equals("+")) {
			val[now] = Integer.toString((Integer.parseInt(val[left[now]]) + Integer.parseInt(val[right[now]])));
		}
		if(val[now].equals("-")) {
			val[now] = Integer.toString((Integer.parseInt(val[left[now]]) - Integer.parseInt(val[right[now]])));
		}
		if(val[now].equals("*")) {
			val[now] = Integer.toString((Integer.parseInt(val[left[now]]) * Integer.parseInt(val[right[now]])));
		}
		if(val[now].equals("/")) {
			val[now] = Integer.toString((Integer.parseInt(val[left[now]]) / Integer.parseInt(val[right[now]])));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int t=1;t<=10;t++) {

			for(int i=0;i<1001;i++) {
				parent[i] = -1;
				left[i] = -1;
				right[i] = -1;
				val[i] = "";
			}

			n = Integer.parseInt(sc.nextLine());

			for(int i=1;i<=n;i++) {
				String[] sa = sc.nextLine().split(" ");
				int idx = Integer.parseInt(sa[0]);
				val[i] = sa[1];
				if(sa.length>=3) {
					left[idx] = Integer.parseInt(sa[2]);
					parent[left[idx]] = idx;
				}
				if(sa.length==4) {
					right[idx] = Integer.parseInt(sa[3]);
					parent[right[idx]] = idx;
				}
			}
			postorder(1);
			System.out.print("#" + t + " " + val[1]);
			System.out.println();
		}
	}
}	
