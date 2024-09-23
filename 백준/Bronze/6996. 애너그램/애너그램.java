import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            t--;

            HashMap<Character, Integer> map = new HashMap<>();
            st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();

            String answer = s1 + " & " + s2 + " are ";

            if (s1.length() != s2.length()) {
                answer += "NOT anagrams.\n";
                bw.write(answer);
                continue;
            }

            for (int i = 0; i < s1.length(); i++) {
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(i);

                map.put(c1, map.getOrDefault(c1, 0) + 1);
                map.put(c2, map.getOrDefault(c2, 0) - 1);

                if (map.get(c1) != null && map.get(c1) == 0) map.remove(c1);
                if (map.get(c2) != null && map.get(c2) == 0) map.remove(c2);
            }

            if (map.size() == 0) answer += "anagrams.\n";
            else answer += "NOT anagrams.\n";

            bw.write(answer);
        }
        bw.close();
    }

}
