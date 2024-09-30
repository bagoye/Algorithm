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
        int x = Integer.parseInt(br.readLine());

        int answer = 0;
        int l = 0;
        int r = n - 1;

        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == x) {
                answer++;
                l++;
            } else if (sum > x) {
                r--;
            } else l++;
        }
        bw.write(answer + "");
        bw.close();
    }
}
