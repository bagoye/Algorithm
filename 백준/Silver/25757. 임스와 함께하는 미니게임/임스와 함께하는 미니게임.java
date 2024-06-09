import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String game = st.nextToken();

        int p = 0;
        if (game.equals("Y")) {
            p = 1;
        } else if (game.equals("F")) {
            p = 2;
        } else if (game.equals("O")) {
            p = 3;
        }

        int cnt = 0;
        int temp = p;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            if (set.contains(name)) {
                continue;
            } else {
                set.add(name);
                temp--;
                if (temp == 0) {
                    cnt++;
                    temp = p;
                }
            }
        }
        bw.write(cnt + "\n");
        bw.close();
    }
}
