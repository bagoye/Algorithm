import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[h][w];
        int[][] arr2 = new int[h + x][w + y];

        for (int i = 0; i < h + x; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < w + y; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < w; j++) {
                arr1[i][j] = arr2[i][j];
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < y; j++) {
                arr1[i][j] = arr2[i][j];
            }
        }

        for (int i = x; i < h; i++) {
            for (int j = y; j < w; j++) {
                arr1[i][j] = arr2[i][j] - arr1[i - x][j - y];
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                bw.write(arr1[i][j] + " ");
            }
            bw.write("\n");
        }

        bw.close();
    }
}
