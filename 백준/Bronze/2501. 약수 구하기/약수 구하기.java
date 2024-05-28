import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int cnt = 0; // 약수 순서 카운트
        int answer = 0; // k번째 약수 저장

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
            if (cnt == k) {
                answer = i;
                break;
            }
        }
        bw.write(answer + "");
        bw.close();
    }
}
