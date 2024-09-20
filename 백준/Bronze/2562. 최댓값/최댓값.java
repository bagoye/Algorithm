import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) arr[i] = Integer.parseInt(br.readLine());

        int max = 0;
        int i = 0;
        int cnt = 0;

        for (int x : arr) {
            cnt++;
            if (x > max) {
                max = x;
                i = cnt;
            }
        }

        bw.write(max + "\n" + i + "");
        bw.close();
    }
}
