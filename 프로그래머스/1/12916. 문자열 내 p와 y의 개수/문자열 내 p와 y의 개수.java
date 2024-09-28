class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();
        int cnt1 = 0;
        int cnt2 = 0;
        for (char x : s.toCharArray()) {
            if (x == 'P') cnt1++;
            else if (x == 'Y') cnt2++;
        }
        return cnt1 == cnt2;
    }
}
