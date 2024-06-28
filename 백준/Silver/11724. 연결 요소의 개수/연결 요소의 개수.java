import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    static int n, m, u, v;
    static int[][] arr;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n + 1][n + 1];
        visit = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            arr[u][v] = arr[v][u] = 1;
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (!visit[i]) {
                bfs(i);
                answer++;
            }
        }

        bw.write(answer + "");
        bw.close();
    }

    public static void bfs(int idx) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(idx);
        visit[idx] = true;
        while (!q.isEmpty()) {
            int temp = q.poll();
            for (int i = 1; i <= n; i++) {
                if (!visit[i] && arr[temp][i] == 1) {
                    visit[i] = true;
                    q.offer(i);
                }
            }
        }
    }
}
