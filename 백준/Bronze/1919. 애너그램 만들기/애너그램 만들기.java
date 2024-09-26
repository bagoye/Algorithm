import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String str1 = br.readLine();
        String str2 = br.readLine();

        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0; i < str1.length(); i++) cnt1[str1.charAt(i) - 'a']++;
        for (int i = 0; i < str2.length(); i++) cnt2[str2.charAt(i) - 'a']++;

        int answer = 0;
        for (int i = 0; i < 26; i++) {
            if (cnt1[i] > cnt2[i]) answer += cnt1[i] - cnt2[i];
            else if(cnt2[i] > cnt1[i]) answer += cnt2[i] - cnt1[i];
        }
        bw.write(answer + "");
        bw.close();
    }
}
