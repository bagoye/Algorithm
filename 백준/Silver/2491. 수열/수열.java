import java.io.*;
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

        int max = 1;
        int cnt1 = 1;
        int cnt2 = 1;
        for (int i = 1; i < n; i++) {
            // 연속해서 커지는 경우
            if (arr[i] >= arr[i - 1]) cnt1++;
            else cnt1 = 1;

            // 연속해서 작아지는 경우
            if (arr[i] <= arr[i - 1]) cnt2++;
            else cnt2 = 1;

            max = Math.max(max, Math.max(cnt1, cnt2));
        }
        bw.write(max + "");
        bw.close();
    }
}
