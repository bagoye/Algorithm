import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int[] card = new int[21];
        for (int i = 0; i < card.length; i++) {
            card[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int temp = 0;
            for (int j = 0; j < (b - a + 1) / 2; j++) {
                temp = card[a + j];
                card[a + j] = card[b - j];
                card[b - j] = temp;
            }
        }

        for (int i = 1; i < card.length; i++) {
            bw.write(card[i] + " ");
        }
        bw.close();
    }
}
