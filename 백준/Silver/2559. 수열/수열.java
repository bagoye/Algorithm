import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int i = 1;
        int sum = 0;

        while (i <= k) {
            sum += arr[i++];
        }
        int max = sum;

        while (i <= n) {
            sum += arr[i] - arr[i - k];
            if (max < sum) {
                max = sum;
            }
            i++;
        }
        bw.write(Integer.toString(max));
        bw.close();
    }

}
