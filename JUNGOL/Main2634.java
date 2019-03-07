import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	static class Node implements Comparable<Node>{
		int x;
		int y;
		Node(int x,int y){
			this.x = x;
			this.y = y;
		}
		@Override
		public int compareTo(Node o) {
			return Integer.compare(x, o.x);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		int m = Integer.parseInt(s[0]);
		int n = Integer.parseInt(s[1]);
		int l = Integer.parseInt(s[2]);
		int ans = 0;
		
		ArrayList<Node> animal = new ArrayList<>();
		ArrayList<Integer> gun = new ArrayList<>();
		s = br.readLine().split(" ");
		for(int i=0;i<m;i++) 
			gun.add(Integer.parseInt(s[i]));
		gun.add(-(1<<30));
		gun.add(1<<30);
		for(int i=0;i<n;i++) {
			s = br.readLine().split(" ");
			animal.add(new Node(Integer.parseInt(s[0]),Integer.parseInt(s[1])));
		}
		Collections.sort(gun);
		Collections.sort(animal);
		
		int start = 0;
		for(int i=0;i<gun.size()-1;i++) {
			if(animal.get(0).x <= gun.get(i+1) && animal.get(0).x >= gun.get(i)) {
				start = i;
				break;
			}
		}
		for(int i=0;i<animal.size();i++) {
			if(animal.get(i).x > gun.get(start+1)) {
				for(int j=start;j<gun.size()-1;j++) {
					if(animal.get(i).x <= gun.get(j+1) && animal.get(i).x >= gun.get(j)) {
						start = j;
						break;
					}
				}				
			}		
			
			int dist = Math.min(animal.get(i).x-gun.get(start), gun.get(start+1)-animal.get(i).x);
			if(dist+animal.get(i).y <= l) {
				ans++;			
			}
		}
		System.out.println(ans);
	}
}
