import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while (q.size() > 1) {
            q.poll(); // 맨 위의 카드를 버림
            q.add(q.poll()); // 맨 위의 카드를 가장 아래의 카드 밑으로 이동
        }

        bw.write(q.poll().toString());
        bw.close();
    }
}
