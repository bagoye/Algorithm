import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        
        Arrays.sort(times);
        long l = 1;
        long r = (long) times[times.length-1] * n;
        
        while(l <= r){
            long m = (l + r) / 2;
            long sum = 0;
            
            for(int i = 0; i < times.length; i++){
                sum += m / times[i];
            }
            
            if(sum >= n){
                answer = m;
                r = m - 1;
            }
            else l = m + 1;
            
        }        
        return answer;
    }

}