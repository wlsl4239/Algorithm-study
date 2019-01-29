import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int t=1;t<=10;t++) {
			int ans = 1;
			int n = Integer.parseInt(sc.nextLine());
			for(int i=0;i<n;i++) {
				String[] sa = sc.nextLine().split(" ");
				
				if(sa[1].equals("+") || sa[1].equals("-") || sa[1].equals("*") || sa[1].equals("/"))
					if(sa.length!=4)
						ans = 0;
			}
			System.out.print("#" + t + " " + ans);
			System.out.println();
		}
	}
}	
