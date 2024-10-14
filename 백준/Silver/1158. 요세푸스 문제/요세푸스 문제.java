import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < k; j++) {
                q.add(q.poll());
            }
            answer[i] = q.poll();
        }

        bw.write("<" + Arrays.stream(answer)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")) + ">");
        bw.close();
    }
}
