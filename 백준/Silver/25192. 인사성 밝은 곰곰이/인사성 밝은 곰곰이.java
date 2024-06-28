import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        int cnt = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
 
            if (s.equals("ENTER")) {
                set.clear();
            } else {
                if (set.contains(s)) {
                    continue;
                }
                set.add(s);
                cnt++;
            }
        }
        bw.write(cnt + "");
        bw.close();
    }
}
