import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        int len = numbers.length;
        String[] str = new String[len];
        
        for (int i = 0; i < len; i++) {
            str[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(str, (o1, o2) -> {
           return (o2 + o1).compareTo(o1 + o2); 
        });
        
        for (String s : str) {
            answer += s;
        }
        
        if (answer.charAt(0) == '0') {
            return "0";
        }
        
        return answer;
    }
}