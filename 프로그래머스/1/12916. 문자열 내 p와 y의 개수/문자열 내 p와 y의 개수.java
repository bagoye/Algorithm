class Solution {
    boolean solution(String s) {
        int cnt1 = 0;
        int cnt2 = 0;
       
        for(char c : s.toLowerCase().toCharArray()){
            if(c == 'p'){
                cnt1++;
            } else if(c == 'y'){
                cnt2++;
            }
        }
        
        return cnt1 == cnt2;
    }
}