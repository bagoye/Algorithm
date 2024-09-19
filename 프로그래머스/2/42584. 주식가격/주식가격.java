public class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for (int i = 0; i < prices.length; i++) {
            int sec = 0;
            
            // i보다 큰 인덱스들을 비교
            for (int j = i + 1; j < prices.length; j++) {
                sec++;
                
                // 가격이 떨어지면 break
                if (prices[i] > prices[j]) {
                    break;
                }
            } 
            answer[i] = sec;
        }
        return answer;
    }
}
