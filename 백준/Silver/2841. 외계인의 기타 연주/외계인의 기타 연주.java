import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        Deque<Integer>[] pushed = new ArrayDeque[7];
        for (int i = 1; i <= 6; i++) {
            pushed[i] = new ArrayDeque<>();
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int fret = Integer.parseInt(st.nextToken());
            while (!pushed[num].isEmpty()) {
                if (pushed[num].peekLast() > fret) {
                    cnt++;
                    pushed[num].pollLast();
                } else break;
            }

            if (!pushed[num].isEmpty() && pushed[num].peekLast() == fret) {
                continue;
            }
            pushed[num].offerLast(fret);
            cnt++;
        }

        bw.write(cnt + "");
        bw.close();
    }
}
