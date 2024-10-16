import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 기능 배포 횟수를 저장할 리스트
        ArrayList<Integer> arr = new ArrayList<>();
        // 각 기능이 완성되는데 걸리는 일수를 저장할 큐
        Queue<Integer> q = new LinkedList<>();
        
        // 각 기능의 남은 작업일수를 계산하여 큐에 저장
        for (int i = 0; i < progresses.length; i++) {
            // 남은 작업량을 속도로 나누어 남은 일수 계산
            // 남은 작업량이 속도로 딱 나누어 떨어지지 않으면 하루를 더 추가해야 함
            if ((100 - progresses[i]) % speeds[i] == 0) {
                q.add((100 - progresses[i]) / speeds[i]);
            } else {
                q.add((100 - progresses[i]) / speeds[i] + 1);
            }
        }

        // 첫 번째 기능의 남은 작업일수를 기준으로 비교 시작
        int temp = q.poll();
        int cnt = 1; // 첫 번째 기능은 무조건 1개 배포
        
        while (!q.isEmpty()) {
            // 현재 배포 기준일보다 빨리 끝나는 기능은 함께 배포
            if (temp >= q.peek()) {
                cnt++; // 함께 배포할 기능 수 증가
                q.poll(); // 큐에서 해당 기능 제거
            } else {
                // 현재까지 함께 배포할 기능 수를 기록
                arr.add(cnt);
                cnt = 1; // 새로운 배포 시작
                temp = q.poll(); // 다음 배포 기준일 설정
            }
        }
        
        arr.add(cnt);
        
        int[] answer = new int[arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}