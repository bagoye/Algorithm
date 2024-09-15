import java.util.Arrays;

class Solution {
  public long solution(long n) {
        String s = "" + n;
        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        String answer = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            answer += arr[i];
        }

        return Long.parseLong(answer);
  }
}