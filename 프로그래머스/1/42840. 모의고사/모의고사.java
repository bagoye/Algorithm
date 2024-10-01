import java.util.*;

class Solution {
    public static ArrayList<Integer> solution(int[] answers) {
        
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        ArrayList<Integer> cnt = new ArrayList<Integer>();
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for (int i = 0; i < 3; i++) cnt.add(0);
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == arr1[i % arr1.length]) cnt.set(0, cnt.get(0) + 1);
            if (answers[i] == arr2[i % arr2.length]) cnt.set(1, cnt.get(1) + 1);
            if (answers[i] == arr3[i % arr3.length]) cnt.set(2, cnt.get(2) + 1);
        }
        
        int max = Collections.max(cnt);
        for (int i = 0; i < cnt.size(); i++) {
            if (cnt.get(i) == max) answer.add(i + 1);
        }
        
        return answer;
    }
}
