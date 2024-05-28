import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(n + " = 1");
            int sum = 1;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    sb.append(" + " + i);
                    sum += i;
                }
            }

            if (n == sum) {
                bw.write(sb.toString() + "\n");
            } else {
                bw.write(n + " is NOT perfect." + "\n");
            }
        }
        bw.close();

    }
}
