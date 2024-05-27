import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        char[][] arr = new char[5][15];
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            String s = br.readLine();
            if (max < s.length()) {
                max = s.length();
            }
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == '\0') {
                    continue;
                }
                sb.append(arr[j][i]);
            }
        }
        bw.write(sb.toString());
        bw.close();
    }
}
