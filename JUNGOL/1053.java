import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        while(true) {
            int n = Integer.parseInt(br.readLine().trim());
            if(n==-1) break;
            n %= 30000;
             
            int[] arr = new int[3];
            arr[0] = 0;
            arr[1] = 1;
            arr[2] = 1;
            for (int i = 3; i <= n; i++) {
                int temp = (arr[2] + arr[1]) % 10000;
                arr[0] = arr[1];
                arr[1] = arr[2];
                arr[2] = temp;
            }
            if (n == 0) System.out.printf("0\n");
            else if (n == 1) System.out.printf("1\n");
            else System.out.printf("%d\n", arr[2]);
             
        }
    }
}
