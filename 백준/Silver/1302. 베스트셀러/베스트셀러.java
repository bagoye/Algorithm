import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = br.readLine();

        Arrays.sort(arr);
        String answer = arr[0];
        int max = 1;
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (!arr[i].equals(arr[i-1])) cnt = 0;
            cnt++;
            if (cnt > max || (cnt == max && arr[i].compareTo(answer) < 0)) {
                answer = arr[i];
                max = cnt;
            }
        }

        bw.write(answer);
        bw.close();
    }
}
