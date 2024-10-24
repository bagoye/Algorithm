import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int dist = y - x;
            // dist 거리의 제곱근을 구해 max 값에 저장 (가장 큰 이동 거리)
            int max = (int) Math.sqrt(dist);

            // 1. 거리가 정확히 제곱수일 경우
            if (max == Math.sqrt(dist)) {
                // max가 제곱수라면 (최대 이동 거리) * 2 - 1 이 최소 이동 횟수
                bw.write(max * 2 - 1 + "\n");
            }
            // 2. 거리가 제곱수 이상이면서 다음 제곱수의 중간까지인 경우
            else if (dist <= max * max + max) {
                // 최대 이동 거리에 중간값 포함 (최대 이동 거리 * 2)
                bw.write(max * 2 + "\n");
            }
            // 3. 그 외의 경우 (제곱수 중간을 넘어선 경우)
            else {
                // 최대 이동 거리보다 한 번 더 이동 (최대 이동 거리 * 2 + 1)
                bw.write(max * 2 + 1 + "\n");
            }
        }
        bw.close();
    }
}
