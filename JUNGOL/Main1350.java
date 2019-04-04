import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static int[][] arr;
	static boolean[] visit;
	static int n, m;

	static class Node implements Comparable<Node>{
		int num;
		int cost;

		public Node(int cost, int num) {
			super();
			this.num = num;
			this.cost = cost;
		}

		@Override
		public int compareTo(Node o) {
			if(this.cost == o.cost)
				return Integer.compare(this.num, o.num);
			return -Integer.compare(this.cost, o.cost);
		}	
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in); 
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[n+1][n+1];
		visit = new boolean[n+1];
		for (int i = 0; i < m; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			arr[a][b] = Math.max(arr[a][b], c);
			arr[b][a] = Math.max(arr[a][b], c);
		}
		visit[1] = true;
		PriorityQueue<Node> pq = new PriorityQueue<>();	//다음 가중치/위치

		for (int i = 1; i <= n; i++) 
			if (arr[1][i] != 0) 
				pq.add(new Node(arr[1][i],i));

		int ans = 0;
		while (!pq.isEmpty()) {
			int now = pq.peek().num;
			int nowcost = pq.peek().cost;
			pq.poll();
			if (visit[now]) continue;

			visit[now] = true;

			ans += nowcost;

			for (int i = 1; i <= n; i++)
				if (arr[now][i] != 0)
					pq.add(new Node(arr[now][i],i));
		}

		System.out.println(ans);

	}
}
