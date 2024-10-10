import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        int l = 0;
        int r = distance;
        
        Arrays.sort(rocks);
        
        while(l <= r) {
            int m = (l + r) / 2;
            int cnt = 0; // 제거한 바위의 개수
            int temp = 0; // 이전 바위, 출발 지점의 위치
            
            for (int i = 0; i < rocks.length; i++) {
                // 현재 바위와 이전 바위 또는 출발 지점과의 거리 확인
                if (rocks[i] - temp < m) {
                    cnt++; // 거리가 m보다 작다면 바위를 제거
                } else {
                    temp = rocks[i]; // 거리가 m 이상이면 temp를 현재 바위 위치로 변경
                }
            }
            
            // 마지막 바위와 도착지점 간의 거리 확인
            if (distance - temp < m) cnt++;
            
            // 제거한 바위 개수가 n보다 작거나 같으면 최소 거리 증가
            if (cnt <= n) {
                answer = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        
        return answer;
    }
}