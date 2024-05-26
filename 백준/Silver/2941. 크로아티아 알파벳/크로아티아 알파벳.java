import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        String[] words = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < words.length; i++) {
            if (s.contains(words[i])) {
                s = s.replace(words[i], ".");
            }
        }

        bw.write(s.length() + "\n");
        bw.close();

    }
}
