import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] light = new int[n + 1];
        for (int i = 0; i < b; i++) {
            light[Integer.parseInt(br.readLine())] = 1;
        }

        for (int i = 1; i <= n; i++) {
            light[i] += light[i - 1];
        }

        int answer = Integer.MAX_VALUE;
        int index = k;
        while (index <= n) {
            answer = Math.min(answer, light[index] - light[index - k]);
            index++;
        }
        bw.write(answer + "");
        bw.close();
    }
}
