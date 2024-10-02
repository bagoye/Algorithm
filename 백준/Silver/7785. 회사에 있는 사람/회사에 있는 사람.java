import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String statue = st.nextToken();

            if (statue.equals("enter")) set.add(name);
            else set.remove(name);
        }
        String[] answer = set.toArray(new String[set.size()]);
        for (int i = answer.length - 1; i >= 0; i--) bw.write(answer[i] + "\n");
        bw.close();

    }
}
