import java.util.*;

class Solution {
  public long solution(long n) {
        String num = Long.toString(n);
        char[] arr = num.toCharArray();

        Arrays.sort(arr);

        String answer = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            answer += arr[i];
        }

        return Long.parseLong(answer);
  }
}