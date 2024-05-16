import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        int s = 1;
        int e = 1;
        int sum = 1;

        while (e != n) {
            if (sum == n) {
                cnt++;
                e++;
                sum += e;
            } else if (sum > n) {
                sum -= s;
                s++;
            } else {
                e++;
                sum += e;
            }
        }
        bw.write(Integer.toString(cnt));
        bw.close();
    }
}
