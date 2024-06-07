import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int p = Integer.parseInt(br.readLine());
        int[] arr = new int[20];

        for (int i = 1; i < p + 1; i++) {
            int cnt = 0;
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            for (int j = 0; j < 20; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for (int j = 0; j < 20; j++) {
                for (int k = 0; k < j; k++) {
                    if (arr[j] < arr[k]) {
                        cnt++;
                    }
                }
            }
            bw.write(t + " " + cnt + "\n");
        }
        bw.close();
    }
}
