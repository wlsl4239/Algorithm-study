import java.util.Scanner;

/*
 * 0 : 3 2 1 1	0001101
 * 1 : 2 2 2 1	0011001
 * 2 : 2 1 2 2	0010011
 * 3 : 1 4 1 1	0111101
 * 4 : 1 1 3 2	0100011
 * 5 : 1 2 3 1	0110001
 * 6 : 1 1 1 4	0101111
 * 7 : 1 3 1 2	0111011
 * 8 : 1 2 1 3	0110111
 * 9 : 3 1 1 2	0001011
 * */
 
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int test = 1;test<=t;test++) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			
			StringBuilder sb = new StringBuilder("");
			String s = "";
			
			for(int i=0;i<m;i++)
				sb.append('0');
//			System.out.println("\n"+sb);
			for(int i=0;i<n;i++) {
				String a = sc.next();
				if(!a.equals(sb.toString())) {
					s = a;
				}
			}
//			System.out.println(s);
			int index = m;
			for(int i=m-1;i>=0;i--) {
				if(s.charAt(i) == '1') {
					index = i;
					break;
				}
			}
			s = s.substring(index-55, index+1);
			
			StringBuilder cyper = new StringBuilder();
			
//			01110110110001011101101100010110001000110100100110111011
			
			for(int i=0;i<8;i++) {
				String sub = s.substring(i*7,i*7+7);
//				System.out.println(sub);
				switch(sub) {
				case "0001101":	cyper.append('0');	break;
				case "0011001":	cyper.append('1');	break;					
				case "0010011":	cyper.append('2');	break;					
				case "0111101":	cyper.append('3');	break;					
				case "0100011":	cyper.append('4');	break;					
				case "0110001":	cyper.append('5');	break;					
				case "0101111":	cyper.append('6');	break;					
				case "0111011":	cyper.append('7');	break;					
				case "0110111":	cyper.append('8');	break;
				case "0001011":	cyper.append('9');	break;	
				}
			}
//			System.out.println(cyper.toString());
			int num = 0;
			int ans = 0;
			num += cyper.charAt(0)-'0'+cyper.charAt(2)-'0'+cyper.charAt(4)-'0'+cyper.charAt(6)-'0';
			num*=3;
			num += cyper.charAt(1)-'0'+cyper.charAt(3)-'0'+cyper.charAt(5)-'0'+cyper.charAt(7)-'0';
			
//			System.out.println(num);
			if(num%10 == 0)	for(int i=0;i<8;i++) ans += cyper.charAt(i) - '0';
			
			System.out.println("#"+test+" "+ans);
			
		}
	}
}
