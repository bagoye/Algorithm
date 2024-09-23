import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        String t = br.readLine();

        while (t.length() > s.length()) {
            if (t.charAt(t.length() - 1) == 'A') {
                t = t.substring(0, t.length() - 1);
            } else if (t.charAt(t.length() - 1) == 'B') {
                t = t.substring(0, t.length() - 1);
                t = new StringBuilder(t).reverse().toString();
            }
        }

        if (t.equals(s)) {
            bw.write("1\n");
        } else {
            bw.write("0\n");
        }
        bw.close();
    }
}
