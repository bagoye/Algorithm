import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        int left = 0;
        int right = -1;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            right = Math.max(right, arr[i]);
        }

        int m = Integer.parseInt(br.readLine());

        while (left <= right) {
            int mid = (left + right) / 2;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > mid) {
                    sum += mid;
                } else {
                    sum += arr[i];
                }
            }

            if (sum <= m) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        bw.write(right + "");
        bw.close();
    }
}
