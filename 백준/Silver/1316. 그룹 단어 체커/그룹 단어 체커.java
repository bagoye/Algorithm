import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int cnt = n;
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            int[] arr = new int[26];
            for (int j = 0; j < word.length(); j++) {
                if (arr[word.charAt(j) - 'a'] == 0) {
                    arr[word.charAt(j) - 'a']++;
                } else if (j > 0 && word.charAt(j) != word.charAt(j - 1)) {
                    cnt--;
                    break;
                }
            }
        }
        bw.write(cnt + "");
        bw.close();
    }
}
