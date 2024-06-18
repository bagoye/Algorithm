import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] p = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(p);
        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += p[j];
            }
            answer += sum;
        }


        bw.write(answer + "");
        bw.close();
    }
}
