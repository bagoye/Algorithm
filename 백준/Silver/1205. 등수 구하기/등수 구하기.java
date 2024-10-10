import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int[] arr = new int[p];
        if (n > 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        if (n == p && arr[0] >= score) {
            bw.write("-1");
            bw.close();
            return;
        }

        int cnt = 1;
        for (int i = p - 1; i >= Math.max(0, p - n - 1); i--) {
            if (arr[i] > score) cnt++;
            else break;
        }
        bw.write(cnt + "");
        bw.close();
    }
}
