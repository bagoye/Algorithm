import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        st = new StringTokenizer(br.readLine(), " ");
        while (t-- > 0) {
            int n = Integer.parseInt(st.nextToken());
            max = n > max ? n : max;
            min = n < min ? n : min;
        }
        bw.write(max * min + "");
        bw.close();
    }

}
