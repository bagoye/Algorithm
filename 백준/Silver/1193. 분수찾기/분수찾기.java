import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int x = Integer.parseInt(br.readLine());
        int cnt = 1;
        int sum = 0;
        while (true) {
            if (x <= sum + cnt) {
                if (cnt % 2 == 1) {
                    bw.write((cnt - (x - sum - 1) + "/" + (x - sum)));
                    break;
                } else {
                    bw.write((x - sum) + "/" + (cnt - (x - sum - 1)));
                    break;
                }
            } else {
                sum += cnt;
                cnt++;
            }
        }
        bw.close();

    }
}
