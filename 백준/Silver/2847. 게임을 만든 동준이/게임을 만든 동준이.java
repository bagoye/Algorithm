import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        int answer = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (score[i] >= score[i + 1]) {
                int diff = score[i] - score[i + 1] + 1;
                answer += diff;
                score[i] -= diff;
            }
        }
        bw.write(answer + "\n");
        bw.close();
    }
}
