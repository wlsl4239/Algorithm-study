import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {
	static int[] Parent;
	static class Edge implements Comparable<Edge>{
		long weight;
		int i;
		int j;
		public Edge(long weight, int i, int j) {
			this.weight = weight;
			this.i = i;
			this.j = j;
		}
		public int compareTo(Edge o) {
			return Long.compare(weight, o.weight);
		}
	}

	static int findSet(int v) {
		if(Parent[v]<0) 
			return v;
		Parent[v] = findSet(Parent[v]);
		return Parent[v];
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int test=1;test<=t;test++) {
			int V = sc.nextInt();
			int E = sc.nextInt();
			
			PriorityQueue<Edge> pq = new PriorityQueue<>();
			Parent = new int[V+1];
			
			for(int i=0;i<=V;i++) {
				Parent[i] = -1;
			}
			
			for(int i=0;i<E;i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				pq.offer(new Edge(c,a,b));
			}
			long sumCost = 0;
			
			while(!pq.isEmpty()) {
				Edge nv = pq.poll();
				if(findSet(nv.i)==findSet(nv.j)) continue;
				
				sumCost += nv.weight;
				Parent[findSet(nv.i)] = findSet(nv.j);
			}
			
			System.out.println("#"+test+" "+sumCost);
		}
	}
}
