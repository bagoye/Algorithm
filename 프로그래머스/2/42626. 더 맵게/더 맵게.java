import java.util.*;

class Solution {
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int s : scoville) pq.add(s);
        
        while(pq.size() > 1){
            if(pq.peek() >= K) return answer;
            int first = pq.poll();
            int second = pq.poll();
            pq.add(first + (second * 2));
            answer ++;
        }
        
        if(pq.peek() < K) return -1;
        return answer;
    }
}