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
        int x = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += arr[i];
        }

        int max = sum;
        int cnt = 1;
        for (int i = x; i < n; i++) {
            sum += arr[i] - arr[i - x];
            if (max == sum) {
                cnt++;
            } else if (max < sum) {
                max = sum;
                cnt = 1;
            }
        }

        if (max == 0) {
            bw.write("SAD");
            bw.close();
            return;
        }

        bw.write(max + "\n");
        bw.write(cnt + "");
        bw.close();
    }
}
