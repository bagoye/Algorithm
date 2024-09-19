import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> lst = new ArrayList<>();
        
        for (int i = 0 ; i < arr.length; i++){
            if(i != 0 && arr[i] == arr[i-1]) continue;
            lst.add(arr[i]);
        }
        
        int[] answer = new int[lst.size()];
        for(int i = 0 ; i < lst.size() ; i++){
            answer[i] = lst.get(i);
        }
        
        return answer;
    }
}