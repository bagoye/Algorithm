import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        int i = 0;
		Queue<Integer> time_q = new LinkedList<Integer>();
		Queue<Integer> truck_q = new LinkedList<Integer>();
		
		while(true) {
			if(!truck_q.isEmpty() && time_q.peek() == answer) {
				time_q.poll();
				sum -= truck_q.poll();
			}
			
			if(i < truck_weights.length && sum + truck_weights[i] <= weight) {
				time_q.offer(answer + bridge_length);
				truck_q.offer(truck_weights[i]);
				sum += truck_weights[i];
				i++;
			}
			
			answer++;
			if(time_q.isEmpty()) break;
		}
		
		return answer;
    }
}