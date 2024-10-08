import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(arr, (o1, o2) -> {
           return (o2 + o1).compareTo(o1 + o2); 
        });
        
        for (String s : arr) answer += s;
        
        if (answer.charAt(0) == '0') return "0";        
        return answer;
    }
}