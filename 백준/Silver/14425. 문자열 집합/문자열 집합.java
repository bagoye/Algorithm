import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = (br.readLine());
        Arrays.sort(arr);
        
        int cnt = 0;
        while (m-- > 0) {
            String x = br.readLine();
            int idx = Arrays.binarySearch(arr, x);
            if (idx >= 0) cnt++;
        }
        bw.write(cnt + "");
        bw.close();
    }
}
