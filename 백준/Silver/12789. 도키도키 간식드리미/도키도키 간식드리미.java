import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            q.offer(Integer.parseInt(st.nextToken()));
        }

        int start = 1;
        while (!q.isEmpty()) {
            if (q.peek() == start) {
                q.poll();
                start++;
            } else if (!s.isEmpty() && s.peek() == start) {
                s.pop();
                start++;
            } else {
                s.push(q.poll());
            }
        }

        while (!s.isEmpty()) {
            if (s.peek() == start) {
                s.pop();
                start++;
            } else {
                bw.write("Sad");
                bw.close();
                return;
            }
        }

        bw.write("Nice");
        bw.close();
    }
}
