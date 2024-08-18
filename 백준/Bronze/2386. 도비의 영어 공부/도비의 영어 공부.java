import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        while (true) {
            String s = br.readLine();

            if (s.equals("#")) {
                break;
            } else {
                String word = String.valueOf(s.charAt(0));

                int n1 = s.length() - s.replace(word.toLowerCase(), "").length();
                int n2 = s.length() - s.replace(word.toUpperCase(), "").length();

                int result = n1 + n2 - 1;

                bw.write(word + " " + result + "\n");
            }
        }
        bw.close();
    }
}
