import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a != b && b != c && a != c) {
            int max = Math.max(a, Math.max(b, c));
            bw.write(max * 100 + "\n");
        } else if (a == b && a == c) {
            bw.write(10000 + a * 1000 + "\n");
        } else if(a == b || a == c) {
            bw.write(1000 + a * 100 + "\n");
        } else {
            bw.write(1000 + b * 100 + "\n");
        }
        bw.close();
    }
}
