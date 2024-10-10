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
        int c = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int answer = 0;
        int l = 0;
        int r = arr[n - 1] - arr[0];

        while (l <= r) {
            int cnt = 1;
            int temp = arr[0];
            int m = (l + r) / 2;

            for (int i = 1; i < n; i++) {
                if (arr[i] - temp >= m) {
                    cnt++;
                    temp = arr[i];
                }
            }

            if (cnt >= c) {
                answer = m;
                l = m + 1;
            } else r = m - 1;
        }

        bw.write(answer  + "");
        bw.close();
    }
}
