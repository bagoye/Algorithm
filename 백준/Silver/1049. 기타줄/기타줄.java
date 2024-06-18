import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int p = 1001;
        int u = 1001;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            p = Math.min(p, Integer.parseInt(st.nextToken()));
            u = Math.min(u, Integer.parseInt(st.nextToken()));
        }

        if (u * 6 < p) {
            bw.write(u * n + "");
            bw.close();
            return;
        }

        int total = p * (n / 6);
        total += Math.min(n % 6 * u, p);
        bw.write(total + "");
        bw.close();

    }
}
