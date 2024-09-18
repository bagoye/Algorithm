import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int answer = 1;
        if (n == 0) answer = 1;
        for (int i = 1; i <= n; i++) {
            answer *= i;
        }
        bw.write(answer + "");
        bw.close();
    }
}
