import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int[] getAlphabetCnt (String str) {
        int[] cnt = new int[26];
        for (int i = 0; i < str.length(); i++) {
            cnt[str.charAt(i) - 'A']++;
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        String str = br.readLine().toUpperCase();
        int[] cnt = getAlphabetCnt(str);

        int max = -1;
        char answer = '?';
        for (int i = 0; i < 26; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                answer = (char) ('A' + i);
            } else if (cnt[i] == max) answer = '?';
        }

        bw.write(answer);
        bw.close();
    }
}