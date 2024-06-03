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

        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        int[] answer = new int[n + m];

        int idx = 0;
        for (int i = 0; i < n; i++) {
            answer[idx++] = Integer.parseInt(a[i]);
        }

        for (int i = 0; i < m; i++) {
            answer[idx++] = Integer.parseInt(b[i]);
        }

        Arrays.sort(answer);

        for (int i : answer) {
            bw.write(i + " ");
        }
        bw.close();

    }
}
