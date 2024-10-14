import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    static class Paper {
        int index;
        int priority;

        Paper(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }

    }

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Queue<Paper> q = new LinkedList<>();
            Integer[] prioritySeq = new Integer[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                prioritySeq[i] = Integer.parseInt(st.nextToken());
                q.offer(new Paper(i, prioritySeq[i]));
            }

            Arrays.sort(prioritySeq, Collections.reverseOrder());
            for (int i = 0; i < n; i++) {
                while (q.peek().priority != prioritySeq[i]) {
                    q.offer(q.poll());
                }
                if (q.peek().index == m) bw.write(i + 1 + "\n");
                q.poll();
            }
        }
        bw.close();
    }
}
