//1228,1229,1230 암호문 1~3 

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		for(int test = 1;test<=10;test++) {
			
			LinkedList<Integer> ll = new LinkedList<>();
			
			int n = sc.nextInt();
			for(int i=0;i<n;i++) {
				int a = sc.nextInt();
				ll.add(a);
			}
			n = sc.nextInt();
			for(int i=0;i<n;i++) {
				String s = sc.next();
				
				switch(s) {
				case "I":
					int num = sc.nextInt();
					int k = sc.nextInt();
					for(int j=0;j<k;j++) {
						int newnum = sc.nextInt();
						ll.add(num, newnum);
						num++;
					}
					break;
					
				case "D":
					int num1 = sc.nextInt();
					int k1 = sc.nextInt();
					for(int j=0;j<k1;j++) {;
						ll.remove(num1);
					}
					break;
					
				case "A":
					int k2 = sc.nextInt();
					for(int j=0;j<k2;j++) {
						int newnum = sc.nextInt();
						ll.addLast(newnum);
					}
					break;
				}
			}			
			System.out.print("#" + test + " ");
			for(int i=0;i<10;i++) {
				System.out.print(ll.removeFirst() + " ");
			}
			System.out.println();
			
		}

	}
}
