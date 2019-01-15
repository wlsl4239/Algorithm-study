import java.util.Scanner;

public class Main14500 {

	public static void main(String[] args) {

		boolean [][][] mask = {	
				{{true, true, true, false},{true, false, false, false},{false, false, false, false},{false, false, false, false}},
				{{true, false, false, false},{true, false, false, false},{true, true, false, false},{false, false, false, false}},
				{{false, false, true, false},{true, true, true, false},{false, false, false, false},{false, false, false, false}},
				{{true, true, false, false},{false, true, false, false},{false, true, false, false},{false, false, false, false}},	
				{{true, true, true, false},{false, false, true, false},{false, false, false, false},{false, false, false, false}},
				{{true, true, false, false},{true, false, false, false},{true, false, false, false},{false, false, false, false}},
				{{true, false, false, false},{true, true, true, false},{false, false, false, false},{false, false, false, false}},
				{{false, true, false, false},{false, true, false, false},{true, true, false, false},{false, false, false, false}},
				{{true, true, true, false},{false, true, false, false},{false, false, false, false},{false, false, false, false}},
				{{true, false, false, false},{true, true, false, false},{true, false, false, false},{false, false, false, false}},
				{{false, true, false, false},{true, true, true, false},{false, false, false, false},{false, false, false, false}},
				{{false, true, false, false},{true, true, false, false},{false, true, false, false},{false, false, false, false}},
				{{true, false, false, false},{true, true, false, false},{false, true, false, false},{false, false, false, false}},
				{{false, true, true, false},{true, true, false, false},{false, false, false, false},{false, false, false, false}},
				{{false, true, false, false},{true, true, false, false},{true, false, false, false},{false, false, false, false}},
				{{true, true, false, false},{false, true, true, false},{false, false, false, false},{false, false, false, false}},
				{{true, true, false, false},{true, true, false, false},{false, false, false, false},{false, false, false, false}},
				{{true, true, true, true},{false, false, false, false},{false, false, false, false},{false, false, false, false}},
				{{true, false, false, false},{true, false, false, false},{true, false, false, false},{true, false, false, false}}
		};

		Scanner sc = new Scanner(System.in);
    
		int n = sc.nextInt();	//세로
		int m = sc.nextInt();	//가로

		int [][] arr = new int [510][510];

		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				arr[i][j] = sc.nextInt();
		
		int ans = 0;
		
		for(int k=0;k<mask.length;k++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					int sum = 0;
					for(int y=0;y<4;y++) {
						for(int x=0;x<4;x++) {
							if(mask[k][y][x])
								sum+=arr[i+y][j+x];
						}
					}
					ans = (ans<sum) ? sum : ans;
					
				}
			}
		}
		
		System.out.println(ans);
	}
}
