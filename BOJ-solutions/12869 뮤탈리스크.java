import java.util.Scanner;

public class Main{

	static int[][][] mutalHP = new int [61][61][61];

	static int func(int x,int y,int z) {
		if(x==0 && y==0 && z==0) return 0;

		if(mutalHP[x][y][z] != -1) return mutalHP[x][y][z];
		
		mutalHP[x][y][z] = Integer.MAX_VALUE;
		mutalHP[x][y][z] = Integer.min(mutalHP[x][y][z], func(Integer.max(0, x - 9), Integer.max(0, y - 3), Integer.max(0, z - 1)) + 1);
		mutalHP[x][y][z] = Integer.min(mutalHP[x][y][z], func(Integer.max(0, x - 9), Integer.max(0, y - 1), Integer.max(0, z - 3)) + 1);
		mutalHP[x][y][z] = Integer.min(mutalHP[x][y][z], func(Integer.max(0, x - 3), Integer.max(0, y - 9), Integer.max(0, z - 1)) + 1);
		mutalHP[x][y][z] = Integer.min(mutalHP[x][y][z], func(Integer.max(0, x - 3), Integer.max(0, y - 1), Integer.max(0, z - 9)) + 1);
		mutalHP[x][y][z] = Integer.min(mutalHP[x][y][z], func(Integer.max(0, x - 1), Integer.max(0, y - 3), Integer.max(0, z - 9)) + 1);
		mutalHP[x][y][z] = Integer.min(mutalHP[x][y][z], func(Integer.max(0, x - 1), Integer.max(0, y - 9), Integer.max(0, z - 3)) + 1);

		return mutalHP[x][y][z];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<61;i++)
			for(int j=0;j<61;j++)
				for(int k=0;k<61;k++)
					mutalHP[i][j][k] = -1;		
		int n = sc.nextInt();
		int a=0,b=0,c=0;
		a = sc.nextInt();
		if(n>=2)
			b = sc.nextInt();
		if(n>=3)
			c = sc.nextInt();

		System.out.println(func(a,b,c));

	}
}
