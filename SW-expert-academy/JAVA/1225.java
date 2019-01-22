import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {		
		Scanner sc = new Scanner(System.in);
		
		int T;		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			Queue<Integer> ll = new LinkedList();
			T = sc.nextInt();
			
			for(int i=0;i<8;i++) {
				int a = sc.nextInt();
				ll.add(a);
			}
			
			while(true) {
				boolean flag = false;
				for(int i=1;i<=5;i++) {
					int temp = ll.poll();
					if(temp-i <= 0) {
						ll.add(0);
						flag = true;
						break;
					}
					else
						ll.add(temp-i);
				}
				if(flag)
					break;
			}
			
			System.out.print("#" + T + " ");
			
			for(int i=0;i<8;i++)
				System.out.print(ll.poll() + " ");
			System.out.println();
		}
	}
}
