import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int num = 0;

        for(int i=0;i<arr.length;i++) {

            int j;

            for (j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    break;
                }
            }

            if (arr[i] == j) {
                num++;
            }
        }
        bw.write(num + "");
        bw.close();
    }
}
