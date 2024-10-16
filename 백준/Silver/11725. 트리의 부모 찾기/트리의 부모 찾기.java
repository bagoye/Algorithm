import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    static List<Integer>[] tree;
    static int[] parent;
    static boolean[] visited;

    public static void rec(int node) {
        visited[node] = true;
        for (int i = 0; i < tree[node].size(); i++) {
            int child = tree[node].get(i);
            if (!visited[child]) {
                parent[child] = node;
                rec(child);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        tree = new ArrayList[n + 1];
        parent = new int[n + 1];
        visited = new boolean[n + 1];
        for (int i = 0; i < n + 1; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            tree[n1].add(n2);
            tree[n2].add(n1);
        }

        rec(1);
        for (int i = 2; i <= n; i++) {
            bw.write(parent[i] + "\n");
        }
        bw.close();
    }
}
