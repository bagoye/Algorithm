import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];

        dfs(0, 0);
        bw.close();
    }

    public static void dfs(int depth, int idx) throws IOException {
        if (depth == m) {
            for (int i : arr) {
                bw.write((i + 1) + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = idx; i < n; i++) {
            arr[depth] = i;
            dfs(depth + 1, i + 1);
        }
    }
}
