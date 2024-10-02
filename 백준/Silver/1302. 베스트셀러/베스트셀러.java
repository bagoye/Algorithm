import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String title = br.readLine();
            map.put(title, map.getOrDefault(title, 0) + 1);
        }

        String answer = "";
        int max = 0;
        for (Map.Entry<String, Integer> title : map.entrySet()) {
            String name = title.getKey();
            int cnt = title.getValue();
            if (cnt > max || (cnt == max && name.compareTo(answer) < 0)) {
                answer = name;
                max = cnt;
            }
        }
        bw.write(answer);
        bw.close();
    }
}
