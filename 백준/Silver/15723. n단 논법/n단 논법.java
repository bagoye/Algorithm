import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public static boolean bfs(int x, int y) {
        visited = new boolean[26];
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        visited[x] = true;

        while (!q.isEmpty()) {
            int temp = q.poll();
            if (temp == y) return true;

            for (int i : graph.get(temp)) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 26; i++) {
            graph.add(new ArrayList<>());
        }

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String[] str = br.readLine().split(" is ");
            char x = str[0].charAt(0);
            char y = str[1].charAt(0);
            graph.get(x - 'a').add(y - 'a');
        }

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            String[] str = br.readLine().split(" is ");
            char x = str[0].charAt(0);
            char y = str[1].charAt(0);

            if (bfs(x - 'a', y - 'a')) bw.write("T\n");
            else bw.write("F\n");
        }

        bw.close();
    }
}
