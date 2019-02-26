class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int ans = 0;
        double min = Double.MAX_VALUE;
        
        for(int i=0;i<A.length;i++){
            if(i+1 < A.length && min>((double)(A[i]+A[i+1])/2)){
                ans = i;
                min = ((double)(A[i]+A[i+1])/2);
            }
            if(i+2 < A.length && min>((double)(A[i]+A[i+1]+A[i+2])/3)){
                ans = i;
                min = ((double)(A[i]+A[i+1]+A[i+2])/3);
            }
        }
        return ans;
    }
}
