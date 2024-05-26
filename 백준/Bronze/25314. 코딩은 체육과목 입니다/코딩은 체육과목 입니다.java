import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String answer = "";
        for (int i = 1; i <= n / 4; i++) {
            answer += "long ";
        }

        bw.write(answer + "int");
        bw.close();
    }
}
