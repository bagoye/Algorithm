import java.io.*;
import java.util.HashMap;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> map = new HashMap<>();
        int max = 0;
        long answer = 0;

        for (int i = 0; i < n; i++) {
            long card = Long.parseLong(br.readLine());
            map.put(card, map.getOrDefault(card, 0) + 1);

            if (map.get(card) > max) {
                max = map.get(card);
                answer = card;
            } else if (map.get(card) == max) {
                answer = Math.min(answer, card);
            }
        }

        bw.write(answer + "");
        bw.close();

    }
}
