import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine().trim());
		String query = br.readLine();
		String[] queryset = new String[n];
		StringBuilder ans = new StringBuilder("");

		for(int i=0;i<n;i++) 
			queryset[i] = query.substring(i*6, i*6+6);

		for(int i=0;i<n;i++) {
			if(queryset[i].equals("000000") || queryset[i].equals("000001") || queryset[i].equals("000010") || queryset[i].equals("000100") || 
					queryset[i].equals("001000") || queryset[i].equals("010000") || queryset[i].equals("100000")) {
				ans.append('A');
			}
			else if(queryset[i].equals("001111") || queryset[i].equals("001110") || queryset[i].equals("001101") || queryset[i].equals("001011") || 
					queryset[i].equals("000111") || queryset[i].equals("011111") || queryset[i].equals("101111")){
				ans.append('B');
			}
			else if(queryset[i].equals("010011") || queryset[i].equals("010010") || queryset[i].equals("010001") || queryset[i].equals("010111") || 
					queryset[i].equals("011011") || queryset[i].equals("000011") || queryset[i].equals("110011")){
				ans.append('C');
			}
			else if(queryset[i].equals("011100") || queryset[i].equals("011101") || queryset[i].equals("011110") || queryset[i].equals("011000") || 
					queryset[i].equals("010100") || queryset[i].equals("001100") || queryset[i].equals("111100")){
				ans.append('D');
			}
			else if(queryset[i].equals("100110") || queryset[i].equals("100111") || queryset[i].equals("100100") || queryset[i].equals("100010") || 
					queryset[i].equals("101110") || queryset[i].equals("110110") || queryset[i].equals("000110")){
				ans.append('E');
			}
			else if(queryset[i].equals("101001") || queryset[i].equals("101000") || queryset[i].equals("101011") || queryset[i].equals("101101") || 
					queryset[i].equals("100001") || queryset[i].equals("111001") || queryset[i].equals("001001")){
				ans.append('F');
			}
			else if(queryset[i].equals("110101") || queryset[i].equals("110100") || queryset[i].equals("110111") || queryset[i].equals("110001") || 
					queryset[i].equals("111101") || queryset[i].equals("100101") || queryset[i].equals("010101")){
				ans.append('G');
			}
			else if(queryset[i].equals("111010") || queryset[i].equals("111011") || queryset[i].equals("111000") || queryset[i].equals("111110") || 
					queryset[i].equals("110010") || queryset[i].equals("101010") || queryset[i].equals("011010")){
				ans.append('H');
			}
			else {
				ans = new StringBuilder(Integer.toString(i+1));
				break;
			}
		}
		System.out.println(ans.toString());

	}
}


