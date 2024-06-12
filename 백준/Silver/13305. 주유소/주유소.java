import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        long[] city = new long[n - 1];
        long[] price = new long[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            city[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            price[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long minPrice = price[0];

        for (int i = 0; i < n - 1; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
            }
            sum += (minPrice * city[i]);
        }

        bw.write(sum + "");
        bw.close();

    }
}
