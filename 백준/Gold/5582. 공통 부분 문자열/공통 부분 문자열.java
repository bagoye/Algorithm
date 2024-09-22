import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String str1 = br.readLine();
        String str2 = br.readLine();
        int max = 0;
        int[][] arr = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    arr[i][j] = arr[i - 1][j - 1] + 1;
                    max = Math.max(max, arr[i][j]);
                }
            }
        }
        bw.write(max + "");
        bw.close();
    }
}
