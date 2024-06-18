import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static int m;
    static int v;
    static boolean[] visited;
    static int[][] graph;
    static Queue<Integer> q;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        visited = new boolean[1001];
        graph = new int[1001][1001];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = 1;
        }

        dfs(v);
        bw.write("\n");

        Arrays.fill(visited, false);
        bfs(v);

        bw.close();

    }

    public static void dfs(int s) throws IOException {
        visited[s] = true;
        bw.write(s + " ");
        for (int i = 1; i <= n; i++) {
            if (graph[s][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int s) throws IOException {
        q = new LinkedList<Integer>();
        q.add(s);
        visited[s] = true;
        bw.write(s + " ");

        while (!q.isEmpty()) {
            int temp = q.poll();
            for (int i = 1; i < graph.length; i++) {
                if (graph[temp][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                    bw.write(i + " ");

                }
            }
        }
    }
}
