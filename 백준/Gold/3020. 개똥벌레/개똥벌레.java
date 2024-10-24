import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[] top = new int[h + 1]; // 종유석
        int[] bottom = new int[h + 1]; // 석순

        for (int i = 0; i < n; i++) {
            int height = Integer.parseInt(br.readLine());
            if (i % 2 == 0) { // 석순
                bottom[height]++;
            } else { // 종유석
                top[height]++;
            }
        }

        for (int i = h - 1; i >= 1; i--) {
            top[i] += top[i + 1];
            bottom[i] += bottom[i + 1];
        }

        int min = Integer.MAX_VALUE;
        int cnt = 0;

        for (int i = 1; i <= h; i++) {
            int sum = top[i] + bottom[h - i + 1]; // 종유석과 석순의 합
            if (sum < min) {
                min = sum;
                cnt = 1; // 최솟값이 갱신되면 개수를 1로 초기화
            } else if (sum == min) {
                cnt++; // 동일한 최솟값이 있을 경우 개수 증가
            }
        }

        bw.write(min + " " + cnt + "\n");
        bw.close();
    }
}
