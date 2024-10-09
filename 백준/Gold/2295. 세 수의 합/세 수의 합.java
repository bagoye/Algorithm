import java.io.*;
import java.util.Arrays;
import java.util.Map;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static boolean isExist(int[] sum, int temp) {
        int l = 0, r = sum.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (sum[m] < temp) l = m + 1;
            else if (sum[m] > temp) r = m - 1;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());

        int[] sum = new int[n * (n + 1) / 2];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum[idx++] = arr[i] + arr[j];
            }
        }
        Arrays.sort(sum);

        int answer = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = arr[i] - arr[j];
                if (isExist(sum, temp)) {
                    answer = Math.max(answer, arr[i]);
                }
            }
        }

        bw.write(answer + "");
        bw.close();
    }
}
