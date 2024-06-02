import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int s = 0;
        int e = -1;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            e = Math.max(e, arr[i]);
        }
        int m = Integer.parseInt(br.readLine());

        while (s <= e) {
            int mid = (s + e) / 2;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > mid) {
                    sum += mid;
                } else {
                    sum += arr[i];
                }
            }

            if (sum <= m) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        bw.write(e + "");
        bw.close();
    }
}
