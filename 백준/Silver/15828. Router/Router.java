import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == -1) {
                break;
            }
            if (num == 0) {
                q.remove();
            } else if (n > q.size()) {
                q.add(num);
            }
        }

        if (q.isEmpty()) {
            bw.write("empty");
        } else {
            for (int i : q) {
                sb.append(i + " ");
            }
            bw.write(sb.toString());
        }
        bw.close();
    }
}
