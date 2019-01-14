import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
    Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
      
	for(int test_case = 1; test_case <= T; ++test_case)
	{
        int a,ans;
        a = sc.nextInt();
        
        if(a<100)
            ans = 0;
        else if(a<1000)
            ans = 1;
        else if(a<10000)
            ans = 2;
        else if(a<100000)
            ans = 3;
        else if(a<1000000)
            ans = 4;
        else
            ans = 5;
        System.out.println("#"+test_case+" "+ans);
	}
    }
}
