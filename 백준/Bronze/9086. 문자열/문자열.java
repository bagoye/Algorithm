import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        String[] answer = new String[t];

        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            answer[i] = s.charAt(0) + s.substring(s.length() - 1, s.length());
        }

        for (int i = 0; i < t; i++) {
            bw.write(answer[i] + "\n");
        }
        bw.close();
    }
}
