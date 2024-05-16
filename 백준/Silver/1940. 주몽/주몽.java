import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int cnt = 0;
        int i = 0; // arr[0] -> min
        int j = n - 1; // arr[n-1]

        while (i < j) {
            if (arr[i] + arr[j] < m) {
                i++;
            } else if (arr[i] + arr[j] > m) {
                j--;
            } else {
                cnt++;
                i++;
                j--;
            }
        }
        bw.write(Integer.toString(cnt));
        bw.close();
    }
}
