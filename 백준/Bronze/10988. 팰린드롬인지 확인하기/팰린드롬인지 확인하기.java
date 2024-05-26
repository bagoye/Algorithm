import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        sb = new StringBuilder(s);
        sb.reverse();
        int answer = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != sb.charAt(i)) {
                answer = 0;
            }
        }

        bw.write(answer + "\n");
        bw.close();
    }
}
