import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    static int[] arr;
    static boolean[] visited;
    static int cnt;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            arr = new int[n + 1];
            visited = new boolean[n + 1];
            cnt = 0;
            
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for (int j = 1; j <= n; j++) {
                if (!visited[j]) {
                    bfs(j);
                }
            }
            
            bw.write(cnt + "\n");
        }
        bw.close();
    }

    public static void bfs(int idx) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(idx);
        visited[idx] = true;

        while (!q.isEmpty()) {
            int temp = q.poll();
            if (!visited[arr[temp]]) {
                visited[arr[temp]] = true;
                q.offer(arr[temp]);
            } else {
                cnt++;
                break;
            }
        }
    }
}
