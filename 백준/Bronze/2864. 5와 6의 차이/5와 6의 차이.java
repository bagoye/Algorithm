import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        a = a.replace('6', '5');
        b = b.replace('6', '5');
        int min = Integer.valueOf(a) + Integer.valueOf(b);

        a = a.replace('5', '6');
        b = b.replace('5', '6');
        int max = Integer.valueOf(a) + Integer.valueOf(b);

        bw.write(min + " " + max);
        bw.close();
    }
}
