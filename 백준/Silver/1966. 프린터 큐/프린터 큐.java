import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            LinkedList<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                // {초기 위치, 중요도}
                queue.offer(new int[] { i, Integer.parseInt(st.nextToken()) });
            }

            int cnt = 0; // 출력 횟수

            while (!queue.isEmpty()) {
                int[] front = queue.poll(); // 가장 첫 원소
                boolean isMax = true; // front 원소가 가장 큰지 판

                // 큐에 남아있는 원소들과 중요도 비교
                for (int i = 0; i < queue.size(); i++) {

                    // 처음 뽑은 원소보다 큐에 있는 i번째 원소가 중요도가 클 경우
                    if (front[1] < queue.get(i)[1]) {

                        // 뽑은 원소 및 i 이전의 원소들을 뒤로 보냄
                        queue.offer(front);
                        for (int j = 0; j < i; j++) {
                            queue.offer(queue.poll());
                        }

                        // front 원소가 가장 큰 원소가 아니라 false를 하고 탐색 마침
                        isMax = false;
                        break;
                    }
                }

                // front 원소가 가장 큰 원소가 아니라 다음 반복문으로 넘어감
                if (isMax == false) {
                    continue;
                }

                // front 원소가 가장 큰 원소였으므로 해당 원소는 출력해야 하는 문서
                cnt++;
                if (front[0] == m) {
                    break;
                }
            }
            sb.append(cnt).append("\n");
        }
        bw.write(sb.toString());
        bw.close();
    }
}
