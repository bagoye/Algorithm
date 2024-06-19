import java.io.*;
import java.util.ArrayList;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        dfs();
        bw.close();
    }

    public static void dfs() throws IOException {
        if (arr.size() == n) {
            for (int num : arr) {
                bw.write(num + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!arr.contains(i)) {
                arr.add(i);
                dfs();
                arr.remove(arr.size() - 1);
            }
        }
    }
}
