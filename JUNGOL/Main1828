import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine().trim());
		int [][] input = new int [n][2];
		boolean[] visit = new boolean[n];
		for(int i=0;i<n;i++) {
			String[] s = br.readLine().split(" ");
			input[i][0] = Integer.parseInt(s[0]);
			input[i][1] = Integer.parseInt(s[1]);
		}
		
		Arrays.sort(input,new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[0], o2[0]);
			}
		});
		for(int i=0;i<n;i++)
			System.out.println(Arrays.toString(input[i]));
		
		int ans = 0;
		for(int i=0;i<n;i++) {
			if(visit[i]) continue;
			int end = input[i][1];
			ans++;
			for(int j=i+1;j<n;j++) {
				if(end < input[j][0]) break;
				end = Math.min(end, input[j][1]);
				visit[j]=true;		
			}
		}
		System.out.println(ans);
		
	}
}


/*

91
3 5
12 37
16 23
140 143
437 522
55 95
608 2898
4614 5026
5729 9521
0 0
0 6
4 25
-24 15
112 297
480 603
52 733
1712 2578
593 2453
695 769
0 0
-9 0
7 22
23 73
-161 113
152 454
193 778
827 2057
1287 7767
2439 2794
0 0
1 3
-42 10
18 39
230 269
86 339
210 817
2673 3451
3054 3717
4176 4969
0 0
-3 1
-43 37
52 54
76 202
258 553
51 647
2066 2387
3100 4254
2391 7004
0 0
0 2
-49 21
-73 58
161 217
423 651
316 682
345 2107
2454 6382
5106 9322
0 0
-9 7
48 49
-36 3
-122 110
635 710
220 292
2013 3319
4155 6749
2609 9557
0 0
3 7
2 12
-94 62
318 368
412 665
591 800
810 1967
3365 4434
3019 3715
0 0
2 3
14 26
49 54
329 364
174 370
766 878
68 2986
3920 6792
832 5078
0 0
-9 4

*/

/*
[-161, 113][-122, 110][-94, 62][-73, 58][-49, 21][-43, 37][-42, 10][-36, 3][-24, 15][-9, 0][-9, 7][-9, 4][-3, 1][0, 0][0, 6][0, 0][0, 0][0, 0][0, 0][0, 2][0, 0][0, 0][0, 0][0, 0]
[1, 3][2, 12][2, 3][3, 5][3, 7]
[4, 25][7, 22][12, 37][14, 26][16, 23][18, 39]
[23, 73][48, 49][49, 54]
[51, 647][52, 733][52, 54]
[55, 95][68, 2986][76, 202][86, 339]
[112, 297][140, 143]
[152, 454][161, 217][174, 370][193, 778][210, 817]
[220, 292][230, 269][258, 553]
[316, 682][318, 368][329, 364][345, 2107]
[412, 665][423, 651][437, 522][480, 603]
[591, 800][593, 2453][608, 2898][635, 710][695, 769]
[766, 878][810, 1967][827, 2057][832, 5078]
[1287, 7767][1712, 2578][2013, 3319][2066, 2387]
[2391, 7004][2439, 2794][2454, 6382][2609, 9557][2673, 3451]
[3019, 3715][3054, 3717][3100, 4254][3365, 4434]
[3920, 6792][4155, 6749][4176, 4969][4614, 5026]
[5106, 9322][5729, 9521]
*/
