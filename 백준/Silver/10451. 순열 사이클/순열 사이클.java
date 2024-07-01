import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            arr = new int[n + 1];
            visited = new boolean[n + 1];
            int cnt = 0;

            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for (int j = 1; j <= n; j++) {
                if (!visited[j]) {
                    dfs(j);
                    cnt++;
                }
            }

            bw.write(cnt + "\n");
        }
        bw.close();

    }

    public static void dfs(int idx) {
        visited[idx] = true;
        if (!visited[arr[idx]]) {
            dfs(arr[idx]);
        }
    }
}
