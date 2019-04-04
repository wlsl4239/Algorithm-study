import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int n = Integer.parseInt(br.readLine());
		int f = Integer.parseInt(br.readLine());
		
		int a = n/100;
		
		for(int i=0;i<100;i++)
			if((a*100+i)%f==0) {
				if(i<10) System.out.print('0');
				System.out.print(i);
				break;
			}
		
	}
}
