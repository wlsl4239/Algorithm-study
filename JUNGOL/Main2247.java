import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int[][] arr = new int[n][2];
		
		for(int i=0;i<n;i++) {
			String[] s = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(s[0]);
			arr[i][1] = Integer.parseInt(s[1]);
		}
		
		Arrays.sort(arr,new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[0], o2[0]);
			}
		});


		int ans1 = 0;
		int ans2 = 0;
		int start = arr[0][0];
		int end = arr[0][1];
		for(int i=1;i<n;i++) {
			if(arr[i][0] <= end) {
				end = Math.max(arr[i][1],end);
				ans1 = Math.max((end-start),ans1);
			}
			else {
				start = arr[i][0];
				ans2 = Math.max(ans2, start - end);
				end = arr[i][1];
				ans1 = Math.max((end-start),ans1);
				
			}
		}
		
		
		System.out.println(ans1 + " " + ans2);
	}
}
