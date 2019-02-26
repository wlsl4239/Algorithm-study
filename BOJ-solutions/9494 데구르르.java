import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int test = Integer.parseInt(br.readLine());
			if(test==0) break;
			int w = 0;
			int h = 0;
			
			String[] str = new String[test];
			for(int i=0;i<test;i++) 
				str[i] = br.readLine();
			
			while(h<test) {
				if(str[h].length()<=w)
					h++;
				else if(str[h].charAt(w)==' ')
					h++;
				else
					w++;
			}
			System.out.println(w+1);
		}
	}
}
