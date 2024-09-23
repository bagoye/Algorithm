import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[26];
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            char c = s.charAt(0);
            arr[c - 97]++;
            if (arr[c - 97] == 5) flag = true;
        }

        if (flag) {
            for (int i = 0; i < 26; i++) {
                if (arr[i] >= 5) {
                    bw.write((char) (i + 97));
                }
            }
        } else {
            bw.write("PREDAJA");
        }
        bw.close();
    }
}
