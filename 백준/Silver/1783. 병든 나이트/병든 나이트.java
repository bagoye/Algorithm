import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int answer = 0;
        if (n == 1) answer = 1;
        if (n == 2) answer = Math.min(4, (m + 1) / 2);
        if (n >= 3) {
            if (m >= 7) answer = m - 2;
            else answer = Math.min(4, m);
        }
        bw.write(answer + "");
        bw.close();
    }
}
