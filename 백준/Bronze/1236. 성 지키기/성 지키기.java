import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] board = new String[n];
        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().trim();
        }

        int a = 0;
        int b = 0;

        for (int i = 0; i < n; i++) {
            if (!board[i].contains("X")) {
                a++;
            }
        }

        for (int j = 0; j < m; j++) {
            boolean x = false;
            for (int i = 0; i < n; i++) {
                if (board[i].charAt(j) == 'X') {
                    x = true;
                    break;
                }
            }
            if (!x) {
                b++;
            }
        }
        bw.write(Math.max(a, b) + "");
        bw.close();
    }
}
