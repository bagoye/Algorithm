import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {

            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][2];

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

            int top = (int) 1e9;
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j][1] < top) {
                    cnt++;
                    top = arr[j][1];
                }
            }

            bw.write(cnt + "\n");
        }
        bw.close();
    }
}
