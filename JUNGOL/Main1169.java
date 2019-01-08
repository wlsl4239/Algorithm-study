package array1;

import java.util.Arrays;
import java.util.Scanner;

public class Main1169_주사위던지기1_서울9반_김경수 {

	public static int n,r,a, data[];

	public static void permutation1(int count) {
		if(count == r) {
			for(int i=0;i<r;i++)
				System.out.print(data[i] + " ");
			System.out.println();
			//System.out.println(Arrays.toString(data));
			return;
		}
		for(int i=1;i<=n;i++) {
			data[count] = i;
			permutation1(count+1);
		}
	}
	public static void permutation2(int before, int count) {
		if(count == r) {
			for(int i=0;i<r;i++)
				System.out.print(data[i] + " ");
			System.out.println();
			//System.out.println(Arrays.toString(data));
			return;
		}
		for(int i=before;i<=n;i++) {
			data[count] = i;
			permutation2(i,count+1);
		}
	}
	public static void permutation3(int count) {		//r = 2, a = 3
		if(count == r) {
			for(int i=0;i<r;i++)
				for(int j=i+1;j<r;j++)  
						if(data[j] == data[i]) return;
			
			for(int i=0;i<r;i++)
				System.out.print(data[i] + " ");
			System.out.println();
			//System.out.println(Arrays.toString(data));
			return;
		}
		for(int i=1;i<=n;i++) {
			data[count] = i;
			permutation3(count+1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = 6;
		r = sc.nextInt();
		a = sc.nextInt();
		data = new int[r];

		
		switch(a) {
		case 1:
			permutation1(0);
			break;
		case 2:
			permutation2(1,0);
			break;
		case 3:
			permutation3(0);
			
			break;

		}

		sc.close();
	}
}

