// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int A, int B, int K) {
        if(A==B) return (A%K==0) ? 1 : 0;
        
        int a = 0;
        int b = 0;
        for(int i=A;i<=B;i++)
            if(i%K==0){
                a = i;
                break;
            }
        for(int i=B;i>=A;i--)
            if(i%K==0){
                b = i;
                break;
            }
        
        return (b-a)/K+1;
    }
}
