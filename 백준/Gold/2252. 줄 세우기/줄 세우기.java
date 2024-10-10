import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    static int n, m, a, b;
    static int[] cnt;
    static ArrayList<ArrayList<Integer>> arr;

    public static void bfs() throws IOException {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            if (cnt[i] == 0) q.offer(i);
        }

        while (!q.isEmpty()) {
            int temp = q.poll();
            bw.write(temp + " ");

            for (int idx : arr.get(temp)) {
                cnt[idx]--;
                if (cnt[idx] == 0) q.offer(idx);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new ArrayList<>();
        for (int i = 0; i <= n; i++) arr.add(new ArrayList<>());

        cnt = new int[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            arr.get(a).add(b);
            cnt[b]++;
        }

        bfs();
        bw.close();
    }
}
