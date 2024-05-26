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

        int[] arr = new int[n];

        for (int a = 0; a < m; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()); // i 바구니부터
            int j = Integer.parseInt(st.nextToken()); // j 바구니까지
            int k = Integer.parseInt(st.nextToken()); // k번 번호가 적혀있는 공을 넣음

            for (int b = i - 1; b < j; b++) {
                arr[b] = k;
            }
        }
        for (int a : arr) {
            bw.write(a + " ");
        }
        bw.close();

    }
}
