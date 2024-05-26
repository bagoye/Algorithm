import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] arr = new int[6];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < chess.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < chess.length; i++) {
            bw.write(chess[i] - arr[i] + " ");
        }
        bw.close();
    }
}
