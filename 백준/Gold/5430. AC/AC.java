import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            char[] cmds = br.readLine().toCharArray();
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), "[,]");
            Deque<String> dq = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                dq.offerLast(st.nextToken());
            }

            boolean isFlipped = false;
            boolean isVailed = true;

            for (char cmd : cmds) {
                if (cmd == 'D') {
                    if (dq.isEmpty()) {
                        isVailed = false;
                        break;
                    }
                    if (isFlipped) dq.pollLast();
                    else dq.pollFirst();
                } else isFlipped = !isFlipped;
            }

            if (isVailed) {
                sb = new StringBuilder();
                while (!dq.isEmpty()) {
                    sb.append(isFlipped ? dq.pollLast() : dq.pollFirst());
                    if (!dq.isEmpty()) sb.append(",");
                }
                bw.write("[" + sb + "]" + "\n");
            } else bw.write("error\n");
        }
        bw.close();
    }
}
