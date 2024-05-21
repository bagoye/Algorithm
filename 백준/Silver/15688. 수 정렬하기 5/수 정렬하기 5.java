import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[2000001];

        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000000]++;
        }

        for (int i = 0; i < 2000001; i++) {
            for (int j = 0; j < arr[i]; j++) {
                bw.write((i - 1000000) + "\n");
            }
        }

        bw.close();
    }
}
