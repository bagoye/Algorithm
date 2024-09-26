import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                bw.write((char) 'a' + s.charAt(i) - 'A');
            } else {
                bw.write((char) 'A' + s.charAt(i) - 'a');
            }
        }
        bw.close();
    }
}
