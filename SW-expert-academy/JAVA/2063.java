package array1;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution2063_중간값찾기_서울9반_김경수 {
	public static void main(String args[]) throws Exception
	{
		System.setIn(new FileInputStream("res/Solution2063_input.txt"));

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
//		Arrays.sort(arr);

		for(int i=n/2;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(arr[j-1]>arr[j]) {
					int tmp=arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[n/2]);

	}

}
