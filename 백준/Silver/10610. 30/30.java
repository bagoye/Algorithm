import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String n = br.readLine().trim();

        if (!n.contains("0")) {
            bw.write("-1");
            bw.close();
            return;
        }

        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0';
        }

        if (sum % 3 != 0) {
            bw.write("-1");
        } else {
            char[] chars = n.toCharArray();
            Arrays.sort(chars);
            StringBuilder sb = new StringBuilder(new String(chars));
            sb.reverse();
            bw.write(sb.toString() + "\n");
        }
        bw.close();
    }
}
