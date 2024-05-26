import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int total = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            total += a * b;
        }

        if (total == x) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.close();


    }
}
