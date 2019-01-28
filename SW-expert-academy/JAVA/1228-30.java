import java.util.LinkedList;
import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {
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

				int x,y;
				switch(s) {
				case "I":
					x = sc.nextInt();
					y = sc.nextInt();
					for(int j=0;j<y;j++) {
						ll.add(x, sc.nextInt());
						x++;
					}
					break;
					
				case "D":
					x = sc.nextInt();
					y = sc.nextInt();
					for(int j=0;j<y;j++) 
						ll.remove(x);
					break;
					
				case "A":
					y = sc.nextInt();
					for(int j=0;j<y;j++) 
						ll.addLast(sc.nextInt());
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
