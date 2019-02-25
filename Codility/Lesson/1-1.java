
//가장 긴 Binary Gap 출력.

//you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        int ans = 0;
        int cnt = 0;
        while(true){
            if(N%2==1) break;
            N/=2;
        }
        
        while(N>0){
            
            if(N%2==1){
                cnt = 0;
            }
            else{
                cnt++;
                ans = Math.max(cnt,ans);
            }
            N/=2;
        }
    return ans;
    }
}
