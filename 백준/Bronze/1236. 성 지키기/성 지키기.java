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

        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) board[i] = br.readLine().toCharArray();

        int rowCnt = 0;
        for (int i = 0; i < n; i++) {
            boolean exist = false;
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'X') {
                    exist = true;
                    break;
                }
            }
            if (exist) rowCnt++;
        }

        int colCnt = 0;
        for (int j = 0; j < m; j++) {
            boolean exist = false;
            for (int i = 0; i < n; i++) {
                if (board[i][j] == 'X') {
                    exist = true;
                    break;
                }
            }
            if (exist) colCnt++;
        }

        int row = n - rowCnt;
        int col = m - colCnt;

        bw.write(Math.max(row, col) + "");
        bw.close();
    }
}
