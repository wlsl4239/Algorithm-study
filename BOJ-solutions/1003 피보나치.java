import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] callzero;
        int[] callone;

        callzero = new int[41];
        callone = new int[41];

        callzero[0] = 1;
        callzero[1] = 0;
        callone[0] = 0;
        callone[1] = 1;

        for (int i = 2; i <= 40; i++) {
            callzero[i] = callzero[i - 1] + callzero[i - 2];
            callone[i] = callone[i - 1] + callone[i - 2];
        }

        int t;
        t = sc.nextInt();
        for(int i=0;i<t;i++) {
            int n;
            n = sc.nextInt();

            System.out.println(callzero[n]+" "+ callone[n]);
        }
    }

}
