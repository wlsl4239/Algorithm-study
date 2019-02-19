import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Solution{
	static long[][] map;
	static int n;
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

	static long kruskal() {
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				if(map[i][j] != -1)
				pq.offer(new Edge(map[i][j],i,j));
		
		
		long sumCost = 0;
		
		while(!pq.isEmpty()) {
			Edge nv = pq.poll();
			if(findSet(nv.i)==findSet(nv.j)) continue;
			
			sumCost += nv.weight;
			Parent[findSet(nv.i)] = findSet(nv.j);
		}
		return sumCost;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
			Scanner sc = new Scanner(System.in);
	
			long t=sc.nextInt();
			for(int test=1;test<=t;test++) {
				n = sc.nextInt();
				map = new long[n][n];
				Parent = new int[n];
				long[] x = new long[n];
				long[] y = new long[n];
				
				for(int i=0;i<n;i++) 
					Parent[i] = -1;				
				for(int i=0;i<n;i++)
					x[i]=sc.nextInt();
				for(int i=0;i<n;i++)
					y[i]=sc.nextInt();
				double e = sc.nextDouble();
				
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(map[i][j]!=0 || i==j) 
							continue;
						map[i][j] = (((x[j]-x[i])*(x[j]-x[i])+(y[j]-y[i])*(y[j]-y[i])));
						map[j][i] = (((x[j]-x[i])*(x[j]-x[i])+(y[j]-y[i])*(y[j]-y[i])));
					}
				}
				
				System.out.printf("#%d %.0f\n",test,(double)(e*kruskal()));
			
		}
	}
}
