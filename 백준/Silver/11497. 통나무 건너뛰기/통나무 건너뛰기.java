import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);

            int[] answer = new int[n];
            int s = 0;
            int e = n - 1;

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    answer[s] = arr[i];
                    s++;
                } else {
                    answer[e] = arr[i];
                    e--;
                }
            }

            int max = 0;

            for (int i = 1; i < n; i++) {
                max = Math.max(max, Math.abs(answer[i] - answer[i - 1]));
            }
            
            max = Math.max(max, Math.abs(answer[0] - answer[n - 1]));

            bw.write(max + "\n");
        }
        bw.close();
    }
}
