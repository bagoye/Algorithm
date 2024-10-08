import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        int[] diff = new int[n - 1];
        for (int i = 0; i < n - 1; i++) diff[i] = arr[i + 1] - arr[i];
        Arrays.sort(diff);

        int answer = 0;
        for (int i = 0; i < n - k; i++) answer += diff[i];

        bw.write(answer + "\n");
        bw.close();
    }
}
