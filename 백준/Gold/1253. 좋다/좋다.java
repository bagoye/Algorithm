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

        int answer = 0;
        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = n - 1;
            int temp = arr[i];
            while (l < r) {
                int sum = arr[l] + arr[r];
                if (sum == temp) {
                    if (l != i && r != i) {
                        answer++;
                        break;
                    } else if (l == i) {
                        l++;
                    } else r--;
                } else if (sum < temp) {
                    l++;
                } else r--;
            }
        }

        bw.write(answer + "");
        bw.close();
    }
}
