import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            arr1[i] = Integer.parseInt(st.nextToken());
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        int x = 0;
        int y = 0;

        if (arr1[0] == arr1[1]) {
            x = arr1[2];
        } else {
            x = (arr1[0] == arr1[2]) ? arr1[1] : arr1[0];
        }

        if (arr2[0] == arr2[1]) {
            y = arr2[2];
        } else {
            y = (arr2[0] == arr2[2]) ? arr2[1] : arr2[0];
        }

        bw.write(x + " " + y);
        bw.close();
    }
}
