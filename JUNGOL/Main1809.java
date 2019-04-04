import java.util.Scanner;
import java.util.Stack;

class Pair{
	int val;
	int index;
	public Pair(int val, int index) {
		this.val = val;
		this.index = index;
	}	
	public int getVal() {
		return val;
	}
	public int getIndex() {
		return index;
	}
}

public class Main{
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for(int test= 1;test<=t; test++) {

			int n = sc.nextInt();
			Stack<Pair> st = new Stack();

			for(int i=1;i<=n;i++) {
				int num = sc.nextInt();

				while(!st.empty() && num > st.peek().getVal()) 
					st.pop();
				
				System.out.print("#" + test + " ");
				if(st.empty())
					System.out.print("0 ");
				else
					System.out.print(st.peek().getIndex() + " ");

				st.add(new Pair(num,i));
			}
			System.out.println();
		}
	}
}
