import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        char[] arr = br.readLine().toCharArray();
        int cnt = 0;
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                cnt++;
            } else if (arr[i] == ')') {
                cnt--;
                if (arr[i - 1] == '(') {
                    answer += cnt;
                } else answer++;
            }
        }
        bw.write(answer + "");
        bw.close();
    }
}
