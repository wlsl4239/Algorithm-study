import java.util.Scanner;

public class Solution {
	public static char arr[] = new char[100];
	public static int num;
	public static void inorder(int now) {
		
		if(now*2 <= num)
		inorder(now*2);
		System.out.print(arr[now]);
		if(now*2+1 <= num)
		inorder(now*2+1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t=1;t<=10;t++) {
			num = Integer.parseInt(sc.nextLine());
			
			for(int i=1;i<=num;i++) {
				String [] ar = sc.nextLine().split(" ");
				arr[i] = ar[1].charAt(0);
			}
            System.out.print("#"+t+" ");
			inorder(1);
			System.out.println();
		}
	}
}
