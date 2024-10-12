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
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        int s = 0, e = 0;
        while (e < n && s <= e) {
            int diff = arr[e] - arr[s];
            if (diff >= m) {
                s++;
                min = Math.min(min, diff);
            } else {
                e++;
            }
        }
        bw.write(min + "");
        bw.close();
    }
}
