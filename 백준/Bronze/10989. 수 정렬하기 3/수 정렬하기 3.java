import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] cnt = new int[10001];
        for (int i = 0; i < n; i++) cnt[Integer.parseInt(br.readLine())]++;
        for (int i = 1; i <= 10000; i++) {
            while (cnt[i]-- > 0) bw.write(i + "\n");
        }
        bw.close();
    }
}
