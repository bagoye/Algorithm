import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        int s = 0;
        int e = arr.length - 1;
        int min = Integer.MAX_VALUE;
        int a1 = 0;
        int a2 = 0;

        while (s < e) {
            int sum = arr[s] + arr[e];
            if (min > Math.abs(sum)) {
                min = Math.abs(sum);
                a1 = arr[s];
                a2 = arr[e];
            }

            if (sum > 0) e--;
            else s++;
        }

        bw.write(a1 + " " + a2);
        bw.close();
    }
}
