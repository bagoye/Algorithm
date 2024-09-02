import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int money = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == b && b == c) {
                money = 10000 + a * 1000;
            } else if (a == b) {
                money = 1000 + a * 100;
            } else if (b == c) {
                money = 1000 + b * 100;
            } else if (c == a) {
                money = 1000 + c * 100;
            } else {
                money = Math.max(a, Math.max(b,c)) * 100;
            }
            max = Math.max(max, money);
        }
        bw.write(max + "");
        bw.close();
    }
}
