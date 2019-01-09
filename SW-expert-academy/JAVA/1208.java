package array1;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution1208_Flatten_서울9반_김경수 {
	
	public static void main(String args[]) throws Exception	{
		System.setIn(new FileInputStream("res/Solution1208_input.txt"));

		Scanner sc = new Scanner(System.in);

		for(int test_case = 1;test_case<=10;test_case++) {
			int ans = 0;
	        int n = sc.nextInt();
	        int arr[] = new int[100];
	        
	        for(int i=0;i<100;i++)
	        	arr[i] = sc.nextInt();
	        
	        Arrays.sort(arr);
	         
	        for(int i=0;i<n;i++) {
	            arr[99]--;
	            arr[0]++;
		        Arrays.sort(arr);
	            if(arr[0] == arr[99])
	            	break;
	            else if(arr[0] == arr[99] - 1)
	            	break;
	        }
	        
	        ans = arr[99] - arr[0];
			System.out.println("#"+test_case+" " + ans);
		}
	}
}