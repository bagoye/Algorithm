import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] words = br.readLine().split(" ");
            for (String word : words) {
                StringBuilder sb = new StringBuilder(word);
                bw.write(sb.reverse().toString() + " ");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
