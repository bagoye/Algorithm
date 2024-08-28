import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            bw.write(s.charAt(i));
            if (i % 10 == 9) {
                bw.write("\n");
            }
        }
        bw.close();
    }
}
