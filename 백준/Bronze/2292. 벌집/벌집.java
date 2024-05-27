import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int cnt = 1; // 방의 수 (시작점 포함)
        int range = 1; // 현재 범위의 끝 번호

        if (n == 1) {
            bw.write("1\n");
        } else {
            while (range < n) {
                range += 6 * cnt; // 다음 범위의 끝 번호
                cnt++;
            }
            bw.write(cnt + "\n");
        }
        bw.close();
    }
}
