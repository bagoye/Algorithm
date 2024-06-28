import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m, u, v;
    static boolean[] visit = new boolean[1001];
    static int[][] arr = new int[1001][1001];

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            arr[u][v] = arr[v][u] = 1;
        }
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (!visit[i]) {
                dfs(i);
                answer++;
            }
        }

        bw.write(answer + "\n");
        bw.close();
    }

    public static void dfs(int idx) {
        if (visit[idx]) {
            return;
        } else {
            visit[idx] = true;
            for (int i = 1; i <= n; i++) {
                if (arr[idx][i] == 1) {
                    dfs(i);
                }
            }
        }
    }
}