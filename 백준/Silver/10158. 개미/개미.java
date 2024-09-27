import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(br.readLine());

//        int timeX = t % (2 * w);
//        int dx = 1;
//        while (timeX-- > 0) {
//            if (p == w) dx = -1;
//            else if (p == 0) dx = 1;
//            p += dx;
//        }
//
//        int timeY = t % (2 * h);
//        int dy = 1;
//        while (timeY-- > 0) {
//            if (q == h) dy = -1;
//            else if (q == 0) dy = 1;
//            q += dy;
//        }
        p = (t + p) % (2 * w);
        q = (t + q) % (2 * h);
        if (p > w) p = 2 * w - p;
        if (q > h) q = 2 * h - q;

        bw.write(p + " " + q);
        bw.close();
    }
}
