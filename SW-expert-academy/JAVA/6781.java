import java.util.Scanner;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int [][] arr = {
				{0,1,2},{1,2,3},{2,3,4},{3,4,5},{4,5,6},{5,6,7},{6,7,8},{7,8,9},{0,0,0},{1,1,1},{2,2,2},{3,3,3},{4,4,4},{5,5,5},{6,6,6},{7,7,7},{8,8,8},{9,9,9},
				{10,11,12},{11,12,13},{12,13,14},{13,14,15},{14,15,16},{15,16,17},{16,17,18},{17,18,19},{10,10,10},{11,11,11},{12,12,12},{13,13,13},{14,14,14},{15,15,15},{16,16,16},{17,17,17},{18,18,18},{19,19,19},
				{20,21,22},{21,22,23},{22,23,24},{23,24,25},{24,25,26},{25,26,27},{26,27,28},{27,28,29},{20,20,20},{21,21,21},{22,22,22},{23,23,23},{24,24,24},{25,25,25},{26,26,26},{27,27,27},{28,28,28},{29,29,29}
		};
		int arr2[][] = new int[157464][9];

		int cnt = 0;
		for(int k=0;k<54;k++)
			for(int i=0;i<54;i++)
				for(int j=0;j<54;j++) {
					arr2[cnt][0] = arr[i][0];
					arr2[cnt][1] = arr[i][1];
					arr2[cnt][2] = arr[i][2];
					arr2[cnt][3] = arr[j][0];
					arr2[cnt][4] = arr[j][1];
					arr2[cnt][5] = arr[j][2];
					arr2[cnt][6] = arr[k][0];
					arr2[cnt][7] = arr[k][1];
					arr2[cnt][8] = arr[k][2];
					cnt++;
				}

		for(int i=0;i<157464;i++) 
			Arrays.sort(arr2[i]);

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			boolean ans = false;
			int[] card = new int[9];

			String st = sc.next();
			
			for(int i=0;i<9;i++)
				card[i] = st.charAt(i) - '0';
			
			st = sc.next();
			
			for(int i=0;i<9;i++) {
				if(st.charAt(i) == 'R') {
					card[i] += 10;
				}
				else if(st.charAt(i) == 'G') {
					card[i] += 20;
				}					
			}
			Arrays.sort(card);

			for(int i=0;i<157464;i++)
				if(Arrays.equals(arr2[i], card)) {
					ans = true;
					break;
				}

			System.out.print("#" + test_case + " ");
			if(ans)
				System.out.println("Win");
			else
				System.out.println("Continue");
		}
	}
}
