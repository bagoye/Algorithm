import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        n /= 100;
        n *= 100;

        int f = Integer.parseInt(br.readLine());
        int answer = 0;

        while (n % f != 0) {
            n++;
            answer++;
        }

        if (answer < 10) {
            bw.write("0" + answer);
        } else {
            bw.write(answer + "");
        }
        bw.close();
    }
}
