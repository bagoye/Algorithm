import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (true) {
            if (n % 5 == 0) {
                cnt += n / 5;
                break;
            } else {
                n -= 2;
                cnt++;
            }

            if (n < 0) {
                break;
            }
        }
        if (n < 0) {
            bw.write("-1");
        } else {
            bw.write(cnt + "");
        }

        bw.close();

    }
}
