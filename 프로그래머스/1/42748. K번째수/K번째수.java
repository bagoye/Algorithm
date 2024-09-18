import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int cnt = 0;
 
        for(int[] i : commands) {
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j = i[0] - 1 ; j < i[1] ; j++) {
                arr.add(array[j]);
            }
            Collections.sort(arr);
            answer[cnt++] = arr.get(i[2] - 1);
        }
 
        return answer;
    }
}