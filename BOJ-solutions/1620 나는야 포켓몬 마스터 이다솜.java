import java.util.HashMap;
import java.util.Scanner;

public class Main1620 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			String s = sc.next();
			map.put(s, Integer.toString(i));
			map.put(Integer.toString(i),s);
		}
		for(int i=0;i<m;i++) {
			String s = sc.next();
			System.out.println(map.get(s));
		}
		
	}
}
